package com.anubhav;

import java.util.Scanner;

public class SumTillZeroInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Sum of the numbers is: " + sum);
    }
}