package com.anubhav;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        if (isEligible(age)) System.out.println("Eligible to vote");
        else System.out.println("Not eligible to vote");
    }

    static boolean isEligible(int age) {
        return (age >= 18);
    }
}
