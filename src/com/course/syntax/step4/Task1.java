package com.course.syntax.step4;

import java.util.Scanner;


/**
 * Task 1(Special): create a program that will
 * print values from 0 to a given number in the console.
 * If the number is negative, an error must be displayed.
 * If the value that will be printed is even - ‘The number is even’ additional message must be printed.
 * If the value that will be printed multiple to 3, only message ‘The number multiple to 3’ must be printed in the console.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("error message: value is less than 0");
        }
        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.println("The number multiple to 3");
                continue;
            } else {
                System.out.print(i);
            }
            if (i % 2 == 0) {
                System.out.println(" The number is even");
            } else {
                System.out.println();
            }
        }
    }
}
