package com.anubhav;

import java.util.Scanner;

public class LargestTillZeroInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = 0, num = 0;
        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();
            if (largest < num) largest = num;
        } while (num != 0);
        System.out.println("Largest number is: " + largest);
    }
}
