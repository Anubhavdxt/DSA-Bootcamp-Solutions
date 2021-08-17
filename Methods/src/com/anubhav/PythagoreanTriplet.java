package com.anubhav;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a triplet: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (isPythagoreanTriplet(a, b, c)) System.out.println("Given triplet is a Pythagorean triplet");
        else System.out.println("Given triplet is not a Pythagorean triplet");
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (a * a == (b * b + c * c)) || (b * b == (a * a + c * c)) || (c * c == (a * a + b * b));
    }
}
