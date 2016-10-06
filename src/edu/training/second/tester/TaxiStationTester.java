package edu.training.second.tester;

import edu.training.second.company.TaxiStation;
import edu.training.second.company.TaxiStationManagement;
import edu.training.second.comparator.CarsByFuelConsumptionComporator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Roman on 05.10.2016.
 */
public class TaxiStationTester { // убрать класс, написать репорт класс
    private static final Logger LOG = LogManager.getLogger();
    public void testTaxiStation(TaxiStation taxiStation, TaxiStationManagement management){
        if(taxiStation.getCarPark().isEmpty()) {
            LOG.info("No cars found.");
            return;
        }
        LOG.info("Testing...");
        management.taxiStationInfo(taxiStation);
        LOG.info("Full price of the car park: " + management.carParkPrice(taxiStation));
        management.sortCars(taxiStation, new CarsByFuelConsumptionComporator());
        management.taxiStationInfo(taxiStation);
        LOG.info("Suitable car: \n" + management.findSuitableCar(taxiStation, 5, 30, 500, 1200));
    }
}
