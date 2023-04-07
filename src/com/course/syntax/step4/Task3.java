package com.course.syntax.step4;

import java.util.Scanner;

public class Task3 {
    /**
     * Task 3: create a program that will find and print the largest integer divisor for a given number in the console.
     * It must not be the given number.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int x = scanner.nextInt();

        int i;
        /* таке собі взяття по модулю, щоб врахувати відʼємні числа */
        if (x <= 0) {
            i = -x;
        } else {
            i = x;
        }
        /* ділимо навпіл шоб зменшити кількість проходів циклу */
        i /= 2;
        while (x % i != 0) {
            i--;
        }
        System.out.println(i);
    }
}
