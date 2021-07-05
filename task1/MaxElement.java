package com.intern.task1;

/**
 * A class for creating a two-dimensional array and finding the maximum element of the array
 */
public class MaxElement {
    private static final double CONST_C = -1.49;
    private static final double CONST_D = 23.4;
    private static final int MAX = 100;
    //two-dimensional array 100x100
    private static final double[][] elements = new double[MAX][MAX];

    public static void main(String[] args) {
        createArray();
        System.out.println("Maximum element of the array: " + searchMax());
    }

    //create two-dimensional array
    private static void createArray() {
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                double element = createElement(i, j);
                elements[i - 1][j - 1] = element;
            }
        }
    }

    //create element of the two-dimensional array
    private static double createElement(int i, int j) {
        double resultLeft = Helper.calculate("sin", Helper.calculate("sin", CONST_C));
        double pow = Helper.calcPower(i, j);
        if (pow == 0) {
            return 0.0;
        }
        double resultRight = (4 * Helper.calculate("ln", Helper.calculate("ln", CONST_D))) / pow;
        return Helper.calculate("sqrt", Helper.calculate("abs", resultLeft - resultRight));
    }

    // search max element of the two-dimensional array
    private static double searchMax() {
        double temp = Double.MIN_VALUE;
        for (double[] element : elements) {
            for (double v : element) {
                if (temp < v) {
                    temp = v;
                }
            }
        }
        return temp;
    }
}
