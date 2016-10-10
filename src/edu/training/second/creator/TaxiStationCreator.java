package edu.training.second.creator;

import edu.training.second.car.Car;
import edu.training.second.company.TaxiStation;
import edu.training.second.management.TaxiStationManagement;
import edu.training.second.exception.CarParamsException;
import edu.training.second.exception.NoSuchCarException;
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
    private final String PATH;

    public TaxiStationCreator(String fileName) {
        this.PATH = fileName;
    }

    public TaxiStationCreator() {
        PATH = "data/cars.txt";
    }

    public void readCarPark(TaxiStation taxiStation, TaxiStationManagement management) {
        try {
            Stream<String> stream = Files.lines(Paths.get(PATH));
            AbstractCarFactory factory = null;
            LOG.info("Reading file...");
            for (String s : stream.collect(Collectors.toList())) {
                try {
                    String[] params = s.split(" ");
                    String typeOfCar = params[0];
                    switch (typeOfCar) {
                        case "Taxi":
                            factory = new TaxiFactory();
                            break;
                        case "CargoTaxi":
                            factory = new CargoTaxiFactory();
                            break;
                        case "Minibus":
                            factory = new MinibusFactory();
                            break;
                        default: throw new NoSuchCarException("There is no such car: " + typeOfCar);
                    }
                    Car c = createCar(factory, params);
                    management.addCar(taxiStation, c);
                } catch (NoSuchCarException e){
                    LOG.error(e);
                } catch (CarParamsException e){
                    LOG.error(e);
                }
            }
        } catch (IOException e) {
            LOG.fatal(e);
            throw new RuntimeException(e);
        }
    }

    public Car createCar(AbstractCarFactory factory, String... params) throws CarParamsException{
        try {
            Car car = factory.createCar(params);
            return car;
        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            throw new CarParamsException("Invalid car params!", e);
        }
    }
}
