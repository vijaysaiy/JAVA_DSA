package com.vijay.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter input:");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is: " +rollNo);
        System.out.println("What is your name?");
        Scanner nameIn = new Scanner(System.in);
        String name = nameIn.nextLine();
        System.out.println("Hello " +name);
        System.out.println("Enter an floating number");
        Scanner floatIn = new Scanner(System.in);
        float floatNum = floatIn.nextFloat();
        System.out.println(floatNum);           //note floating point numbers are not accurate
    }
}
