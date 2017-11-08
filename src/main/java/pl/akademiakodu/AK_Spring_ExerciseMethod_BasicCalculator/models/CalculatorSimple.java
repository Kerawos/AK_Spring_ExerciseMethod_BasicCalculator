package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

public class CalculatorSimple {

    public int add( int a, int b){
//        //todo implement method here
//        return 0;
        return a + b;
    }

    public int subtract( int a, int b){
//        //todo implement method here
//        return 0;
        return a - b;
    }

    public int multiplication( int a, int b){
//        //todo implement method here
//        return 0;
        return a * b;
    }

    public int division (int a, int b){
//        //todo implement method here
//        return 0;
        if (b==0){
            throw new IllegalArgumentException("Division by 0");
        }
        return a / b;
    }
}
