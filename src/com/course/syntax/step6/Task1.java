package com.course.syntax.step6;
import java.util.Scanner;

/**
 * Task 1: for given string sentence from the console delete all spaces and bring it to uppercase,
 * after print result word by letters in column to the console.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String result = sentence.replace(" ", "").toUpperCase();
        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));
        }
    }
}
