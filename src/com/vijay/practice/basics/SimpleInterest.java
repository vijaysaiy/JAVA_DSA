package com.vijay.practice.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the following parameter to Calculate Simple interest.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter Time in years: ");
        float time = input.nextFloat();
        System.out.print("Enter Rate in %:");
        float rate = input.nextFloat();
        float si = (principal*time*rate)/100;
        System.out.println("Simple interest is: " +si);
    }
}
