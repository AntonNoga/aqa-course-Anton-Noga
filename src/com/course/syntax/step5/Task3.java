package com.course.syntax.step5;

/**
 * Task 3: for exist array with numbers find the biggest number and print it to the console.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {3,17,5,5,-16,0};
        int max = arr[0];
        for (int i:arr) {
            if (i>max) {
                max=i;
            }
        }
        System.out.println(max);
    }
}

