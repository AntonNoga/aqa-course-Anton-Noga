package com.course.syntax.step4;

import java.util.Scanner;

/**
 * Task 2: create a program that will calculate and print the factorial value of a given number from the console.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Please enter x>=0");
        } else if (x == 0) {
            System.out.println("factorial for x is 1");
        } else {
            int fx = x;
            for (int i = x; i > 1; i--) {
                fx *= (i - 1);
            }
            System.out.println("factorial for x is " + fx);
        }
    }
}
