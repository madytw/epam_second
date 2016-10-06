package edu.training.second.car;

/**
 * Created by Roman on 26.09.2016.
 */
public abstract class Car {
    private Specification carSpecification;
    private String model;
    private double fuelConsumption;
    private int load;
    private int capacity;
    private int price;

    public Car(Specification carSpecification, String model, double fuelConsumption, int load, int capacity, int price) {
        this.carSpecification = carSpecification;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.load = load;
        this.capacity = capacity;
        this.price = price;
    }

    public Car() {
        this.carSpecification = new Specification();
        this.model = "UnknownModel";
        this.fuelConsumption = 3.0;
        this.load = 300;
        this.capacity = 4;
        this.price = 1000;
    }



    public Specification getCarSpecification() {
        return carSpecification;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  carSpecification.toString() + '\n' +
                "model='" + model + "', " +
                "fuelConsumption=" + fuelConsumption + ", " +
                "load=" + load + ", " +
                "capacity=" + capacity + ", " +
                "price=" + price +
                "\n";
    }
}
