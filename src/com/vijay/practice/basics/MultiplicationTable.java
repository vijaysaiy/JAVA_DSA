package com.vijay.practice.basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number for you want to print a Multiplication table:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 1;
        System.out.println("Multiplication table for " + num + " is: ");
        while(count <= 10){
            System.out.println(num + " * " + count +" = " + (num*count));
            count++;
        }
    }
}
