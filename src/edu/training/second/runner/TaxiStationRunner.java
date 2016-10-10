package edu.training.second.runner;

import edu.training.second.company.TaxiStation;
import edu.training.second.management.TaxiStationManagement;
import edu.training.second.comparator.CarsByFuelConsumptionComparator;
import edu.training.second.creator.TaxiStationCreator;
import edu.training.second.report.TaxiStationReport;

/**
 * Created by Roman on 01.10.2016.
 */
public class TaxiStationRunner {
    public static void main(String[] args){
        TaxiStationCreator creator = new TaxiStationCreator();
        TaxiStation station = new TaxiStation();
        TaxiStationManagement management = new TaxiStationManagement();

        creator.readCarPark(station, management); // reading car park for our station

        TaxiStationReport.showCarPark(station, "Taxi Station"); // car park info
        TaxiStationReport.showSuitableCar(management.findSuitableCar(station, 5, 30, 500, 1200)); // finding suitable car
        TaxiStationReport.showCarParkPrice(management.carParkPrice(station)); // calculating price of the car park
        management.sortCars(station, new CarsByFuelConsumptionComparator()); // sorting our car park
        TaxiStationReport.showCarPark(station, "Sorted Taxi Station"); // sorted car park info
    }
}


