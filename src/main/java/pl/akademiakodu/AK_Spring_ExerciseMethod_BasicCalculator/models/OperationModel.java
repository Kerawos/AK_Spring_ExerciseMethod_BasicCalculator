package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

//holder for data
public class OperationModel {

    private int a;
    private int b;

    public OperationModel() {
    }

    public OperationModel(int a) {
        this.a = a;
    }

    public OperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
