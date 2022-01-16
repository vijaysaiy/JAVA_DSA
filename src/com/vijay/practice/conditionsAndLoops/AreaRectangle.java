package com.vijay.practice.conditionsAndLoops;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.print("Enter length and breadth:");
        Scanner in = new Scanner(System.in);
        float length = in.nextFloat();
        float breadth = in.nextFloat();
        float area = length * breadth;
        System.out.println("Area of the Rectangle is:" + area);
    }
}
