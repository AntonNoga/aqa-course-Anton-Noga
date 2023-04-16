package com.course.syntax.step2;

public class Task2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("initial value: " + x);
        System.out.println("pre++ " + ++x + " Аfter: " + x);

        x = 0;
        System.out.println("initial value: " + x);
        System.out.println("post++ " + x++ + " Аfter: " + x);

        x = 0;
        System.out.println("initial value: " + x);
        System.out.println("pre-- " + --x + " Аfter: " + x);

        x = 0;
        System.out.println("initial value: " + x);
        System.out.println("post-- " + x-- + " Аfter: " + x);
    }
}
