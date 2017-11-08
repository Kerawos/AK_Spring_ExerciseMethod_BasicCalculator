package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAverageTest {

    private static CalculatorAverage calculator;

    @BeforeClass
    public static void start(){
        calculator = new CalculatorAverage();
    }

    @AfterClass
    public static void stop(){
        calculator = null;
    }

    @Test
    public void operationTest(){
        assertEquals(calculator.squareOf(8),64);
        assertEquals(calculator.elementOf(9),3);
        assertEquals(calculator.factorial(5),120);
        assertEquals(calculator.isPrimeNumber(2),true);
        assertEquals(calculator.isPrimeNumber(13),true);
        assertEquals(calculator.isPrimeNumber(9),false);
        assertNotEquals(calculator.factorial(4),10);
    }

}