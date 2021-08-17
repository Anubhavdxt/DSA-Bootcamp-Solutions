package com.anubhav;

import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("Prime numbers between %d & %d are: ", a, b);
        allPrimes(a, b);
    }

    static void allPrimes(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) System.out.printf("%d ", i);
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
