package edu.training.second.creator;

import edu.training.second.car.Car;
import edu.training.second.company.TaxiStation;
import edu.training.second.company.TaxiStationManagement;
import edu.training.second.comparator.CarsByFuelConsumptionComporator;
import edu.training.second.exception.NotSuchCarException;
import edu.training.second.factory.AbstractCarFactory;
import edu.training.second.factory.CargoTaxiFactory;
import edu.training.second.factory.MinibusFactory;
import edu.training.second.factory.TaxiFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Roman on 01.10.2016.
 */
public class TaxiStationCreator {
    private static final Logger LOG = LogManager.getLogger();
    private static final String FILE_NAME = "data/cars.txt";

    public void readCarPark(TaxiStation taxiStation, TaxiStationManagement management) {
        try {
            Stream<String> stream = Files.lines(Paths.get(FILE_NAME));
            AbstractCarFactory factory = null;
            LOG.info("Reading file...");
            for (String s : stream.collect(Collectors.toList())) {
                try {
                    String[] params = s.split(" ");
                    switch (params[0]) {
                        case "Taxi":
                            factory = new TaxiFactory();
                            break;
                        case "CargoTaxi":
                            factory = new CargoTaxiFactory();
                            break;
                        case "Minibus":
                            factory = new MinibusFactory();
                            break;
                        default: throw new NotSuchCarException("There is no such car: " + params[0]);
                    }
                    Car c = factory.createCar(params);
                    management.addCar(taxiStation, c);
                } catch (NumberFormatException e) {
                    LOG.error(e);
                } catch (NotSuchCarException e){
                    LOG.error(e);
                }catch (IllegalArgumentException e){
                    LOG.error(e);
                }catch (ArrayIndexOutOfBoundsException e){
                    LOG.error("Check your input data!", e);
                }
            }
        } catch (IOException e) {
            LOG.fatal(e);
            throw new RuntimeException();
        }
    }
}
