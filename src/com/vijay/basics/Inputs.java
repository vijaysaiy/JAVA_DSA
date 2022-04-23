package com.vijay.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
    Two types:
        1.BufferedReader -> a simple class used to read a char or sequence of char
        2.Scanner   -> advanced method to read inputs, it can read formatted input
 */
public class Inputs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string");
        String s = br.readLine();
        System.out.println("Your entered " + s);
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Integer input:");
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
        input.close();
        nameIn.close();
        floatIn.close();
    }
}
