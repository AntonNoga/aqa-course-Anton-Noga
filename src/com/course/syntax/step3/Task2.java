package com.course.syntax.step3;

import java.util.Scanner;

/**
 * Task 2: create a program, that will scan double value from console and
 * if value is odd - first message printing to console,
 * if even - second message printing to console.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        double x = scanner.nextDouble();
        if (x % 2 == 0) {
            System.out.println("second message");
        } else {
            System.out.println("first message");
        }

    }
}
