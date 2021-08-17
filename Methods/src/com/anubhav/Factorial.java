package com.anubhav;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.printf("Factorial of %d is: %d", num, fact(num));
    }

    static int fact(int n) {
        int factorial = 1;
        if (!(n == 0 || n == 1)) {
            factorial = n * fact(n - 1);
        }
        return factorial;
    }
}
