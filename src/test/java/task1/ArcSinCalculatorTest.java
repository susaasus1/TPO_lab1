package test.java.task1;

import main.java.task1.ArcSinCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ArcSinCalculatorTest {
    static private final double delta = 0.1;

    @ParameterizedTest
    @ValueSource(doubles = {0.34, 0.6, 0.75})
    public void positiveNumbersTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.34, -0.6, -0.75})
    public void negativeNumbersTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0001, 10, 100.212})
    public void numbersGreaterThanOneTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0001, -10, -100.212})
    public void numbersLessThanNegativeOneTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.95, 0.97, 0.99})
    public void numbersCloseToOneTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.89, -0.90, -0.901})
    public void numbersCloseToNegativeOneTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 0.05, 0.1})
    public void positiveNumbersCloseToZeroTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.01, -0.05, -0.1})
    public void negativeNumbersCloseToZeroTest(double value) {
        Assertions.assertEquals(Math.asin(value), ArcSinCalculator.asin(value), delta);
    }
}
