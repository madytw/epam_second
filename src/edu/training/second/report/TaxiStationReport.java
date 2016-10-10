package edu.training.second.report;

import edu.training.second.car.Car;
import edu.training.second.company.TaxiStation;


/**
 * Created by Roman on 06.10.2016.
 */
public class TaxiStationReport {

    public static void showCarPark(TaxiStation station, String s) {
        System.out.println("-------------------" + s + "-----------------");
        System.out.print(station.toString());
        System.out.println("------------------------------------------------");
    }

    public static void showSuitableCar(Car c) {
        if (c == null) {
            System.out.println("Nothing was found.");
        }else {
            System.out.println("Suitable car:");
            System.out.println(c.toString());
        }
    }

    public static void showCarParkPrice(int price) {
        System.out.println("Full price of the car park: " + price);
    }
}
