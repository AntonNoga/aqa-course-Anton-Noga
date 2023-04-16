package com.course.syntax.step6;
import java.util.Scanner;

/**
 * Task 3: create a program, that will count number of certain letters in the sentence.
 * Program must read from the console sentence and after read a symbol, number of which must be count.
 * Program must print count of certain letters to the console.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a letter to count: ");
        char letter = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("Result:" + count);
    }
}
