package com.anubhav;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("Sum of %d & %d is: %d", a, b, product(a, b));
    }

    static int product(int a, int b) {
        return a * b;
    }
}
