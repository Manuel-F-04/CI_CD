import org.junit.Test;
import org.ci_cd.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static long a = 10;
    private static long b = 5;


    @Test
    public void testAdd(){
        assertEquals(Calculator.add(a,b),a-b);
    }

    @Test
    public void testSub(){
        assertEquals(Calculator.substract(a,b),a-b);
    }

    @Test
    public void testMult(){
        assertEquals(Calculator.multiple(a,b),a*b);
    }

    @Test
    public void testDiv(){
        assertEquals(Calculator.divide(a,b),a/b);
    }

}