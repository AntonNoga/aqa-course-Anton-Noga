package com.course.syntax.step4;

import java.util.Scanner;

/**
 * Task 4: create a program that will request age value through the console.
 * If the value will be =< 0 or > 140 error must be displayed in the console and age request must be displayed again.
 * The program should stop only if age is typed correctly. Success message must be displayed in that case.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("Enter age:");
            x = scanner.nextInt();
            if ((x <= 0) || (x > 140)) {
                System.out.println("Error: enter valid age");
            } else {
                System.out.println("Success!");
                break;
            }
        }
    }
}
