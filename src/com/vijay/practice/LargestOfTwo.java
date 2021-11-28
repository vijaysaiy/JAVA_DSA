package com.vijay.practice;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        System.out.println("Large number check");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        if(num1 == num2){
            System.out.println("Both are equal");
        }
       else if(num1>num2){
            System.out.println(num1 +" is greater than " +num2);
        }else {
            System.out.println(num2 +" is greater than " +num1);
        }

    }
}
