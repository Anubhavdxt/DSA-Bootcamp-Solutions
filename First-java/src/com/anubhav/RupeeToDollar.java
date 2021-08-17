package com.anubhav;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the currency in Rupee: ");
        double rupee = in.nextInt();
        double dollar = rupee/74;
        System.out.printf("%.2f INR = %.2f USD", rupee, dollar);
    }
}
