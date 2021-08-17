package com.anubhav;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = in.nextInt();
        areaPerimeter(r);
    }

    static void areaPerimeter(int r) {
        double area, perimeter;
        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;
        System.out.printf("Area of circle is: %.2f & perimeter is: %.2f", area, perimeter);
    }
}
