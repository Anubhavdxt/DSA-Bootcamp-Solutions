package com.anubhav;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a principle, rate & time: ");
        int principle = in.nextInt();
        int rate = in.nextInt();
        int time = in.nextInt();
        int interest = (principle * rate * time) / 100;
        System.out.println("Interest is: " + interest);
    }
}
