package com.vijay.practice.basics;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Please Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + ", Welcome to Cisco");
    }
}
