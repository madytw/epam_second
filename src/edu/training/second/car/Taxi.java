package edu.training.second.car;

import edu.training.second.type.*;


/**
 * Created by Roman on 27.09.2016.
 */
public class Taxi extends Car {
    private int tariffPerKm;
    private Service service;

    public Taxi(Specification carSpecification, String model, double fuelConsumption, int load, int capacity, int price, int tariffPerKm, Service s) {
        super(carSpecification, model, fuelConsumption, load, capacity, price);
        this.tariffPerKm = tariffPerKm;
        service = s;
    }

    public Taxi() {
        this.tariffPerKm = 10;
        service = Service.PHONE_CHARGER;
    }

    public int getTariffPerKm() {
        return tariffPerKm;
    }

    public void setTariffPerKm(int tariffPerKm) {
        this.tariffPerKm = tariffPerKm;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Taxi:\n" + super.toString() +
                "tariffPerKm=" + tariffPerKm + ", " +
                "service=" + service +
                "\n";
    }
}
