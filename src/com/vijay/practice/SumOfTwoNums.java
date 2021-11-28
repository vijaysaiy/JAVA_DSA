package com.vijay.practice;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of Two numbers is: " +sum);
    }
}
