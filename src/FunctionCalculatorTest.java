import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionCalculatorTest {

    @Test
    public void testCalculateFunction() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(-13.795714285714288, calculator.calculateFunction(0.7), 0.000001);
        assertEquals(12.61671280506559, calculator.calculateFunction(1.3), 0.000001);
        assertEquals(2.7326440265160508, calculator.calculateFunction(2.0), 0.000001);
    }

    @Test
    public void testCalculateSteps() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(260, calculator.calculateSteps(0.7, 2, 0.005));
    }

    /*@Test
    public void testGetYValue() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(-13.795714285714288, calculator.getYValue(0), 0.000001);
        assertEquals(0.181785, calculator.getYValue(120), 0.000001);
        assertEquals(1.930675, calculator.getYValue(260), 0.000001);
    }

    @Test
    public void testGetXValue() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(0.7, calculator.getXValue(0), 0.000001);
        assertEquals(1.3, calculator.getXValue(120), 0.000001);
        assertEquals(2.0, calculator.getXValue(260), 0.000001);
    }*/

    @Test
    public void testFindMaxIndex() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(259, calculator.findMaxIndex());
    }

    @Test
    public void testFindMinIndex() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(0, calculator.findMinIndex());
    }

    @Test
    public void testCalculateSum() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(-437.370783106572, calculator.calculateSum(), 0.000001);
    }

    @Test
    public void testCalculateAverage() {
        FunctionCalculator calculator = new FunctionCalculator(1.0, 1.65, 0.7, 2, 0.005);
        assertEquals(-1.6821953196406616, calculator.calculateAverage(), 0.000001);
    }
}
