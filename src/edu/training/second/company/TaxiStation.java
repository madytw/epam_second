package edu.training.second.company;

import edu.training.second.car.Car;

import java.util.ArrayList;

/**
 * Created by Roman on 27.09.2016.
 */
public class TaxiStation {
    private ArrayList<Car>  carPark;

    public TaxiStation() {
        this.carPark = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarPark() {
        return carPark;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("TaxiStation info:\n");
        carPark.stream().forEach(c -> sb.append(c.toString()+'\n'));
        return sb.toString();
    }
}
