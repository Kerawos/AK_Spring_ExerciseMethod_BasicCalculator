package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

public class CalculatorAverage {

    public int squareOf(int a){
//        //todo implement method
//        return 0;
        return a * a;
    }

    public int elementOf(int a){
//        //todo implement method
//        return 0;
        int result = 1;
        for (int i = 1; i < a; i++) {
            if (i*i==a || i*i>a){
                result = i;
                break;
            }
        }
        return result;
    }


    public int factorial(int a){
//        //todo implement method
//        return 0;
        int sum = 1;
        for (int i = 2; i <= a ; i++) {
            sum*=i;
        }
        return sum;
    }

    public boolean isPrimeNumber(int a){
//        //todo implement method
//        return 0;
        if (a<2){
            throw new IllegalArgumentException("Number must be greater than 1");
        }
        if (a==2){
            return true;
        }
        for (int i = 2; i <(a/2)+1 ; i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }






}
