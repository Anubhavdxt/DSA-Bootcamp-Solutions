package com.anubhav;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("Sum of %d & %d is: %d", a, b, sum(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
