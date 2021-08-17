package com.anubhav;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (isPalindrome(num)) System.out.printf("%d is a pallindrome number", num);
        else System.out.printf("%d is not a palindrome number", num);
    }

    static boolean isPalindrome(int n) {
        int temp = n, num = 0;
        while (temp != 0) {
            num = num * 10 + temp % 10;
            temp /= 10;
        }
        return num == n;
    }
}
