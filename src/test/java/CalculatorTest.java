import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4, 7);
    }

    @Test
    public void hasFirstNum(){
        assertEquals(4, calculator.getFirstNum());
    }

    @Test
    public void hasSecondNum(){
        assertEquals(7, calculator.getSecondNum());
    }

    @Test
    public void hasAddFunction(){
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void hasSubtractFunction(){
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    public void hasMultiplyFunction(){
        assertEquals(90, calculator.multiply(10, 9));
    }

    @Test
    public void hasDivideFunction(){
        assertEquals(6, calculator.divide(30, 5));
    }
}
