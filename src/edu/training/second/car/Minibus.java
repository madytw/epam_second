package edu.training.second.car;

import edu.training.second.type.BusType;

/**
 * Created by Roman on 27.09.2016.
 */
public class Minibus extends Car {
    private BusType typeOfBus;

    public Minibus(Specification carSpecification, String model, double fuelConsumption, int load, int capacity, int price, BusType typeOfBus) {
        super(carSpecification, model, fuelConsumption, load, capacity, price);
        this.typeOfBus = typeOfBus;
    }

    public Minibus() {
        this.typeOfBus = BusType.TRAFFIC;
    }

    public BusType getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(BusType typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    @Override
    public String toString() {
        return "Minibus:\n" + super.toString() +
                "typeOfBus=" + typeOfBus +
                "\n";
    }
}
