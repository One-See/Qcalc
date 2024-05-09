package com.crio.qcalc;

public class StandardCalculator {

    protected double result = 0;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public double getResult() {
        return result;
    }

    
    public final void add(int num1, int num2) throws ArithmeticException {
        add((double) num1, (double) num2);
    }


    public final void subtract(int num1, int num2) throws ArithmeticException {
        subtract((double) num1, (double) num2);
    }


    public final void multiply(int num1, int num2) throws ArithmeticException {
        multiply((double) num1, (double) num2);
    }


    public final void divide(int num1, int num2) throws ArithmeticException {
        divide((double) num1, (double) num2);
    }

    public final void add(double num1, double num2) throws ArithmeticException {
        double result = num1 + num2;

        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
    }

    public final void subtract(double num1, double num2) throws ArithmeticException {
        double result = num1 - num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
    }

    public final void multiply(double num1, double num2) throws ArithmeticException {
        result = num1 * num2;

        if (Double.isInfinite(result) || result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException();
        }

    }

    public final void divide(double num1, double num2) throws ArithmeticException {
        result = num1 / num2;

        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }


        if (Double.isInfinite(result)) {
            throw new ArithmeticException();
        }

    }

    
    public void printResult(){

        System.out.println("Standard Calculator Result:"+ result);

    }

    
    public void clearResult() {

        result = 0;
    }
}
