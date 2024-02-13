package com.average.of.three;

public class AverageOfThree {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    public static int maxInput=10;

    public AverageOfThree(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    private int getSumOfThree() {
        return this.firstNumber + this.secondNumber + this.thirdNumber;
    }

    public double getAverageOfThree() {
        return getSumOfThree()/3.0;
    }
}
