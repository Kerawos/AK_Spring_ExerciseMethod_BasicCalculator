package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorSimpleTest {

    private static CalculatorSimple calculator;

    @BeforeClass
    public static void start(){
        calculator = new CalculatorSimple();
    }

    @AfterClass
    public static void stop(){
        calculator = null;
    }

    @Test
    public void operationTest(){
        assertEquals(calculator.add(4,6),10);
        assertEquals(calculator.subtract(4,6),-2);
        assertEquals(calculator.multiplication(4,6),24);
        assertEquals(calculator.division(4,2),2);
        assertNotEquals(calculator.multiplication(2,2),6);
    }

}