package com.vijay.practice.conditionsAndLoops;

import java.util.Scanner;

public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the side");
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        float area = (float) ((Math.sqrt(3)/4) * side * side);
        System.out.println("Area of Equilateral triangle is:" + area);
    }
}
