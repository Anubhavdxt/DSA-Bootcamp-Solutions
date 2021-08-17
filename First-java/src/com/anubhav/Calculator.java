package com.anubhav;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, res = 0;
        char op;
        while (true) {
            System.out.print("Enter an op +, -, *, /, %: ");
            op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the numbers: ");
                a = in.nextInt();
                b = in.nextInt();

                if (op == '+') res = a + b;
                if (op == '-') res = a - b;
                if (op == '*') res = a * b;
                if (op == '/') {
                    if (b != 0) res = a / b;
                    else System.out.println("You can't divide a number by zero");
                }
                if (op == '%') res = a % b;
                System.out.println("Result is: " + res);
            } else if (op == 'X' || op == 'x') break;
            else System.out.println("Invalid operator!!!");
        }
    }
}
