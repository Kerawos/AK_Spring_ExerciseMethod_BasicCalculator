package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

/**
 * Class store user inputs
 */
public class OperationModel {

    /**
     * Variables declaration
     */
    private int a;
    private int b;

    public OperationModel() {
    }

    /**
     * Store only one user input
     * @param a
     */
    public OperationModel(int a) {
        this.a = a;
    }

    /**
     * Store two user inputs
     * @param a
     * @param b
     */
    public OperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Getters and setters section
     * @return
     */
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
