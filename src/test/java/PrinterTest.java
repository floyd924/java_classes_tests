import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PrinterTest {

    private Printer printer;
    @Before
    public void before(){
        printer = new Printer(42, 100);
    }

    @Test
    public void hasSheetsRemaining(){
        assertEquals(42, printer.getSheetsRemaining());
    }

    @Test
    public void canPrintTwoDocs(){
        printer.print(2, 6);
        assertEquals(30, printer.getSheetsRemaining());
    }

    @Test
    public void canPrintThreeBiggerDOcs(){
        printer.print(3, 9);
        assertEquals(15, printer.getSheetsRemaining());
    }

    @Test
    public void cannotPrintLoadsOfPages(){
        printer.print(6, 10);
        assertEquals(42, printer.getSheetsRemaining());
    }

    @Test
    public void canRefill(){
        printer.refill(30);
        assertEquals(72, printer.getSheetsRemaining());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void losesInkWhenPrinting(){
        printer.print(1, 4);
        assertEquals(96, printer.getTonerVolume());
    }



}
