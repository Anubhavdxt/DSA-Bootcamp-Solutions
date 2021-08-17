package com.anubhav;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers: ");
        a = in.nextInt();
        b = in.nextInt();
//        int res = a > b ? a : b;
        int res = Math.max(a, b);
        System.out.printf("Largest of %d & %d is %d", a, b, res);
    }
}
