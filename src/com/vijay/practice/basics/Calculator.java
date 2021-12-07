package com.vijay.practice.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Simple calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the operation +,-,*,/");
        char op = input.next().charAt(0);
        switch (op) {
            case '+' -> System.out.println("Sum is: " + (num1 + num2));
            case '-' -> System.out.println("Difference is: " + (num1 - num2));
            case '*' -> System.out.println("Multiplication is: " + (num1 * num2));
            case '/' -> System.out.println(num2 != 0 ? "Division is: " + (num1 / num2) : "Infinite");
            default -> System.out.println("Invalid operation");
        }

    }
}
