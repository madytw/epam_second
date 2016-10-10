package test.edu.training.second;

import edu.training.second.creator.TaxiStationCreator;
import edu.training.second.exception.CarParamsException;
import edu.training.second.factory.TaxiFactory;
import org.junit.Test;

/**
 * Created by Roman on 09.10.2016.
 */
public class CarCreationTest {

    @Test(expected = CarParamsException.class)
    public void checkCarCreation() throws CarParamsException{
        TaxiStationCreator creator = new TaxiStationCreator();
        creator.createCar(new TaxiFactory(), new String[]{"asd", "asdasd","dasd"});
    }

}
