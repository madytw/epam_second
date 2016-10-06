package edu.training.second.car;

import edu.training.second.type.CarBody;
import edu.training.second.type.DriveUnit;
import edu.training.second.type.Engine;
import edu.training.second.type.Transmission;

/**
 * Created by Roman on 27.09.2016.
 */
public class Specification {
    private Transmission transmission;
    private Engine engine;
    private DriveUnit driveUnit;
    private CarBody body;

    public Specification(Transmission transmission, Engine engine, DriveUnit driveUnit, CarBody body) {
        this.transmission = transmission;
        this.engine = engine;
        this.driveUnit = driveUnit;
        this.body = body;
    }

    public Specification() {
        this.transmission = Transmission.MANUAL;
        this.engine = Engine.DIESEL;
        this.driveUnit = DriveUnit.REAR;
        this.body = CarBody.UNIVERSAL;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public DriveUnit getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(DriveUnit driveUnit) {
        this.driveUnit = driveUnit;
    }

    public CarBody getBody() {
        return body;
    }

    public void setBody(CarBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Specification: " +
                "transmission=" + transmission +
                ", engine=" + engine +
                ", driveUnit=" + driveUnit +
                ", body=" + body;
    }
}
