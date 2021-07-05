package com.intern.task1;

/*
 * Helper class
 */
public class Helper {

    // Operation selection and calculation
    static double calculate(String func, double arg) {
        double result = 0.0;

        if (func.equals("sin")) {
            result = Math.sin(arg);
        }
        if (func.equals("ln")) {
            result = Math.log(arg);
        }
        if (func.equals("sqrt")) {
            result = Math.sqrt(arg);
        }
        if (func.equals("abs")) {
            result = Math.abs(arg);
        }
        return result;
    }

    // Calculating right to left exponentiation
    static double calcPower(double first, double second) {
        return Math.pow(first, second);
    }
}


