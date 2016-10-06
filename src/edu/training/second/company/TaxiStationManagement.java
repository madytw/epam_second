package edu.training.second.company;

import edu.training.second.car.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by Roman on 27.09.2016.
 */
public class TaxiStationManagement {
    private static final Logger LOG = LogManager.getLogger();

    public void addCar(TaxiStation taxiStation, Car car) {
        taxiStation.getCarPark().add(car);
    }

    public void removeCar(TaxiStation taxiStation, Car car) {
        ArrayList<Car> cars = taxiStation.getCarPark();
        while (cars.contains(car)) {
            cars.remove(car);
        }
    }

    public void taxiStationInfo(TaxiStation taxiStation) {
        LOG.info(taxiStation);
    }

    public int carParkPrice(TaxiStation taxiStation) {
        return taxiStation.getCarPark().stream().mapToInt(c -> c.getPrice()).sum();
    }

    public Car findSuitableCar(TaxiStation taxiStation, int minCapacity, int maxCapacity, int minLoad, int maxLoad) {
        ArrayList<Car> cars = taxiStation.getCarPark();
        Car suitableCar = cars.stream().filter((car) -> (car.getCapacity() >= minCapacity && car.getCapacity() <= maxCapacity)
                && (car.getLoad() >= minLoad && car.getLoad() <= maxLoad)).findFirst().get();
        return suitableCar;
    }

    public void sortCars(TaxiStation taxiStation, Comparator<Car> comparator) {
        Collections.sort(taxiStation.getCarPark(), comparator);
    }

}
