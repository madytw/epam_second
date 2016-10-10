package edu.training.second.car;

import edu.training.second.type.Service;

/**
 * Created by Roman on 27.09.2016.
 */
public class CargoTaxi extends Taxi {
    private int tariffPerKg;

    public CargoTaxi(Specification carSpecification, String model, double fuelConsumption, int load, int capacity, int price, int tariffPerKm, int tariffPerKg, Service s) {
        super(carSpecification, model, fuelConsumption, load, capacity, price, tariffPerKm, s);
        this.tariffPerKg = tariffPerKg;
    }

    public CargoTaxi() {
        this.tariffPerKg = 10;
    }

    public int getTariffPerKg() {
        return tariffPerKg;
    }

    public void setTariffPerKg(int tariffPerKg) {
        this.tariffPerKg = tariffPerKg;
    }

    @Override
    public String toString() {
        return "Cargo" + super.toString() +
                "tariffPerKg=" + tariffPerKg +
                "\n";
    }
}
