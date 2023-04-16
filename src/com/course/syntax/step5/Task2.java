package com.course.syntax.step5;

/**
 * Task 2: merge 2 given arrays.
 * Result must be an array, that contains all elements from first and second arrays.
 * Value must be calculated for arrays with any length.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr_merged = new int[arr1.length+arr2.length];

        int index=0;
        for (int i:arr1) {
            arr_merged[index] = i;
            index++;
        }

        index = arr1.length;
        for (int i:arr2) {
            arr_merged[index] = i;
            index++;
        }

        for (int i:arr_merged
             ) {
            System.out.println(i);
        }

    }
}
