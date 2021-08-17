package com.anubhav;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.printf("Sum of first %d natural numbers is: %d", n, sum(n));
    }

    static int sum(int n) {
        return n * (n + 1) / 2;
    }
}