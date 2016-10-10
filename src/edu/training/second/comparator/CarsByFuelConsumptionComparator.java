package edu.training.second.comparator;

import edu.training.second.car.Car;

import java.util.Comparator;

/**
 * Created by Roman on 01.10.2016.
 */
public class CarsByFuelConsumptionComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getFuelConsumption(), o2.getFuelConsumption());
    }
}
