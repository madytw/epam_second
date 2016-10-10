package edu.training.second.factory;

import edu.training.second.car.Car;
import edu.training.second.car.Minibus;
import edu.training.second.car.Specification;
import edu.training.second.type.*;

/**
 * Created by Roman on 01.10.2016.
 */
public class MinibusFactory extends AbstractCarFactory {
    @Override
    public Car createCar(String... params) {
        final int TRANSMISSION = 1;
        final int ENGINE = 2;
        final int DRIVEUNIT = 3;
        final int CARBODY = 4;
        final int MODEL = 5;
        final int FUEL = 6;
        final int LOAD = 7;
        final int CAPACITY = 8;
        final int PRICE = 9;
        final int BUSTYPE = 10;
        Specification spec = new Specification(Transmission.valueOf(params[TRANSMISSION]), Engine.valueOf(params[ENGINE]), DriveUnit.valueOf(params[DRIVEUNIT]), CarBody.valueOf(params[CARBODY]));
        Minibus bus = new Minibus(spec, params[MODEL], Double.parseDouble(params[FUEL]),
                                 Integer.parseInt(params[LOAD]), Integer.parseInt(params[CAPACITY]),
                                 Integer.parseInt(params[PRICE]), BusType.valueOf(params[BUSTYPE]));
        return bus;
    }
}
