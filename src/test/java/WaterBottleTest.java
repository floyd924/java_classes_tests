import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterBottle;
    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasBeenDrank(){
        waterBottle.haveDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void hasBeenDrankTwice(){
        waterBottle.haveDrink();
        waterBottle.haveDrink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void hasBeenDrankFourTimes(){
        waterBottle.haveDrink();
        waterBottle.haveDrink();
        waterBottle.haveDrink();
        waterBottle.haveDrink();
        assertEquals(60, waterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }



}
