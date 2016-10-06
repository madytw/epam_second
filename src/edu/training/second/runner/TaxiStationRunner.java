package edu.training.second.runner;

import edu.training.second.company.TaxiStation;
import edu.training.second.company.TaxiStationManagement;
import edu.training.second.creator.TaxiStationCreator;
import edu.training.second.tester.TaxiStationTester;

/**
 * Created by Roman on 01.10.2016.
 */
public class TaxiStationRunner {
    public static void main(String[] args){
        TaxiStationCreator creator = new TaxiStationCreator();
        TaxiStationTester tester = new TaxiStationTester();
        TaxiStation station = new TaxiStation();
        TaxiStationManagement managment = new TaxiStationManagement();
        creator.readCarPark(station, managment);
        tester.testTaxiStation(station, managment);
    }
}


