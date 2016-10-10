package test.edu.training.second;

import edu.training.second.company.TaxiStation;
import edu.training.second.management.TaxiStationManagement;
import edu.training.second.creator.TaxiStationCreator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Roman on 08.10.2016.
 */
public class TaxiStationExceptionTest {
    private static TaxiStation station;
    private static TaxiStationManagement management;

    @BeforeClass
    public static void initTaxiCompany() {
        station = new TaxiStation();
        management = new TaxiStationManagement();
    }

    @Test(expected = RuntimeException.class)
    public void checkFileAvailability() {
        TaxiStationCreator creator = new TaxiStationCreator("data/car.txt");
        creator.readCarPark(station, management);
    }

    @Test
    public void checkCarAmount() {
        TaxiStationCreator creator = new TaxiStationCreator("data/testcars.txt");
        creator.readCarPark(station, management);
        int expected = 2;
        int actual = station.getCarPark().size();
        Assert.assertEquals(expected, actual);
    }

}
