package com.anubhav;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int fact = 1;
        if(num != 0) while (num != 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial is: " + fact);
    }
}
