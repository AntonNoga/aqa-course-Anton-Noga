package com.course.syntax.step5;

/**
 * Task 1: calculate average value of given array with numbers and print this value to the console.
 * Program must calculate average value for array with any number of elements.
 */
public class Task1 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0};
        int len  = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum+=arr[i];
        }
        int avrg = sum/len;
        System.out.println("avarage value is " + avrg);
    }
}
