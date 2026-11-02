
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class CalculatorTest extends TestCase {

    @Test
    public void testAdd(){
        Calculator calculateAdd = new Calculator();
        assertEquals(10,calculateAdd.addCalculate(4,6));
    }

    @Test
    public void testMultiply(){
        Calculator calculateMultiply = new Calculator();
        assertEquals(10,calculateMultiply.multiply(2,6));
    }

    @Test
    public void testDivide(){
        Calculator calculateDivision = new Calculator();
        assertEquals(2.5,calculateDivision.divide(5.0,2.0));
    }

}