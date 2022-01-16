package com.vijay.practice.conditionsAndLoops;

import java.util.Scanner;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.print("Enter height and breadth:");
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float breadth = in.nextFloat();
        float area = 0.5f * height * breadth;
        System.out.println("Area of the Triangle is: " + area);

    }
}
