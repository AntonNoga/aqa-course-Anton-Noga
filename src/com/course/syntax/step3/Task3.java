package com.course.syntax.step3;

import java.util.Scanner;

public class Task3 {
    /**
     * Task 3: create a program, that will scan float value from console and
     * if this value is divisible without remainder by 2 and larger than 10 or if value equals 15 - first message is printing to the console,
     * if not - second message is printing to console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        float x = scanner.nextFloat();
        if ((x == 15) || ((x > 10) && (x % 2 == 0))) {
            System.out.println("first message");
        } else {
            System.out.println("second message");
        }
    }
}
