package com.course.syntax.step6;
import java.util.Scanner;
/**
 * Task 2: for given string sentence, check, that sentence contains word java,
 * if yes - reverse the string and print it,
 * if no - print the sentence(each even word must be uppercase).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        if (sentence.contains("java")) {
            char[] charArray = sentence.toCharArray();
            int len = sentence.length();
            for (int i = 0; i < len/2; i++) {
                char buf;
                buf = charArray[i];
                charArray[i] = charArray[len - i - 1];
                charArray[len - i - 1] = buf;
            }
            sentence = new String(charArray);
            }
        else {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 1) {
                    words[i] = words[i].toUpperCase();
                }
            }
            sentence = String.join(" ", words);
        }
        System.out.println(sentence);
    }
}
