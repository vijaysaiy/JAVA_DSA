package com.vijay.practice.conditionsAndLoops;

import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        System.out.print("Enter breadth and height:");
        Scanner in = new Scanner(System.in);
        float breadth = in.nextFloat();
        float height = in.nextFloat();
        float area = breadth * height;
        System.out.println("Area of Parallelogram is:" + area);
    }
}
