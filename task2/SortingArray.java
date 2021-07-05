package com.intern.task2;

import java.util.Arrays;
import java.util.Random;

/**
 * The class creates an array from random elements and sorts them
 */
public class SortingArray {

    private static final Random random = new Random();
    private static final int MAX = 100;
    private static int size = 0;
    private static final double[] elements = new double[MAX];

    public static void main(String[] args) {
        createArray();
        testSortArray();
     }

    // Creating an array from random elements
    public static void createArray() {
        for (int i = 0; i < MAX; i++) {
            double element = random.nextDouble() * MAX;
            elements[i] = setElement(element);
        }
    }

    // Array insertion from the setter
    public static double setElement(double value) {
        elements[size] = value;
        size++;
        return value;
    }

    // Bubble sort
    public static void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = elements.length - 1; j > i; j--) {
                if (elements[j - 1] > elements[j]) {
                    double temp = elements[j - 1];
                    elements[j - 1] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    // Outputting the contents of the array
    public static void display(double [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(i + "  " + arr[i]);
    }

    // A method that tests the correctness of the sort function in the class
    public static void testSortArray(){
        //create teat array from copy first array
        double[] test;
        test = Arrays.copyOf(elements, elements.length);

        //sort first array
        sort();
        System.out.println("After sort");
        display(elements);

        //sort test array
        System.out.println("After sort test");
        Arrays.sort(test);
        display(test);

        //equality check of arrays
        boolean check = checkArrays(test);
        printResult(check);
    }

    // Check two arrays for equality
    public static boolean checkArrays(double[] test){
        //equality check of arrays
        boolean check = true;
        try {
            for (int i = 0; i < test.length - 1; i++) {
                if (test[i] != elements[i]) {
                    check = false;
                    break;
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
        return check;
    }

    // Prints test results
    public static void printResult(boolean check){
        if(check){
            System.out.println("Array equality check passed");
        } else {
            System.out.println("No test passed");
        }
    }
}
