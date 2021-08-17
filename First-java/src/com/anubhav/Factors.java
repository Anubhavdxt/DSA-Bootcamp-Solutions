package com.anubhav;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.printf("Factors of %d are: ", num);
        for(int fact = 1; fact <= num; ++fact) {
            if (num % fact == 0) {
                System.out.print(fact + " ");
            }
        }

    }
}
