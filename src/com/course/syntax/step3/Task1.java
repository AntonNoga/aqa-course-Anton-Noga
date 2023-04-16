package com.course.syntax.step3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("Third message");
        } else if (x < 10) {
            System.out.println("First message");
        } else if (x > 10) {
            System.out.println("Second message");
        } else {
            System.out.println("unknown value");
        }
    }
}
