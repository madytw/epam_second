package edu.training.second.management;

import edu.training.second.car.Car;
import edu.training.second.company.TaxiStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;


/**
 * Created by Roman on 27.09.2016.
 */
public class TaxiStationManagement {

    public void addCar(TaxiStation taxiStation, Car car) {
        if (car != null) {
            taxiStation.getCarPark().add(car);
        }
    }

    public int carParkPrice(TaxiStation taxiStation) {
        return taxiStation.getCarPark().stream().mapToInt(c -> c.getPrice()).sum();
    }

    public Car findSuitableCar(TaxiStation taxiStation, int minCapacity, int maxCapacity, int minLoad, int maxLoad) {
        try {
            ArrayList<Car> cars = taxiStation.getCarPark();
            Car suitableCar = cars.stream().filter((car) -> (car.getCapacity() >= minCapacity && car.getCapacity() <= maxCapacity)
                    && (car.getLoad() >= minLoad && car.getLoad() <= maxLoad))
                    .findFirst()
                    .get();
            return suitableCar;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public void sortCars(TaxiStation taxiStation, Comparator<Car> comparator) {
        Collections.sort(taxiStation.getCarPark(), comparator);
    }

}
