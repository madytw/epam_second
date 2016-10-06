package edu.training.second.factory;

import edu.training.second.car.Car;
import edu.training.second.car.Specification;
import edu.training.second.car.Taxi;
import edu.training.second.type.*;

/**
 * Created by Roman on 01.10.2016.
 */
public class TaxiFactory extends AbstractCarFactory {
    @Override
    public Car createCar(String... params) {
        Specification spec = new Specification(Transmission.valueOf(params[1]), Engine.valueOf(params[2]), DriveUnit.valueOf(params[3]), CarBody.valueOf(params[4]));
        Taxi taxi = new Taxi(spec, params[5], Double.parseDouble(params[6]), Integer.parseInt(params[7]), Integer.parseInt(params[8]), Integer.parseInt(params[9]), Integer.parseInt(params[10]), Service.valueOf(params[11]));
        return taxi;
    }

}
