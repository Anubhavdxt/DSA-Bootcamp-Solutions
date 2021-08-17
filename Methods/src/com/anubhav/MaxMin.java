package com.anubhav;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        minMax(a, b, c);
    }

    static void minMax(int a, int b, int c) {
        int min, max;
        max = Math.max(a, Math.max(b, c));
        min = Math.min(a, Math.min(b, c));
        System.out.printf("Max of %d, %d & %d is: %d & min: %d", a, b, c, max, min);
    }
}
