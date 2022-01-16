package com.vijay.practice.conditionsAndLoops;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float PI = 3.14159f;
        float area = PI * radius * radius;
        System.out.println("Area of Circle of radius " + radius + " is:" + area);
    }
}
