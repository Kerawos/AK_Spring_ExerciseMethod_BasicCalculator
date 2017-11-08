package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

public class CalculatorSimple {

    public int add( int a, int b){
        System.out.println(a);
        System.out.println(b);
        return a + b;
    }

    public int subtrackt( int a, int b){
        return a - b;
    }

    public int multiplication( int a, int b){
        return a * b;
    }

    public int division (int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Division by 0");
        }
        return a / b;
    }
}