package com.course.syntax.step5;

/**
 * Task 4: create a program, that will sort by asc given array with numbers and print result array to the console.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {-17,-30,14,0,999};
        int buf;
        boolean is_sorted;
        do {
            is_sorted=true;
            for (int index = 0; index < arr.length - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    buf = arr[index + 1];
                    arr[index + 1] = arr[index];
                    arr[index] = buf;
                    is_sorted = false;
                }
            }
        } while (!is_sorted);

        for (int i:arr
        ) {
            System.out.println(i);
        }
    }
}
