package com.anubhav;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if (isEven(n)) System.out.printf("%d is even", n);
        else System.out.printf("%d is odd", n);
    }

    static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}
