package edu.training.second.factory;

import edu.training.second.car.Car;


/**
 * Created by Roman on 01.10.2016.
 */
public abstract class AbstractCarFactory {
    public abstract Car createCar(String...params);
}
