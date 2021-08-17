package com.anubhav;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();
        System.out.println("Your grades: " + grades(marks));
    }

    static String grades(int marks) {
        if (marks >= 91 && marks <= 100) return "AA";
        if (marks >= 81 && marks <= 90) return "AB";
        if (marks >= 71 && marks <= 80) return "BB";
        if (marks >= 61 && marks <= 70) return "BC";
        if (marks >= 51 && marks <= 60) return "CD";
        if (marks >= 41 && marks <= 50) return "DD";
        return "Fail";
    }
}
