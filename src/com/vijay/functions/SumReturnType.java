package com.vijay.functions;

import java.util.Scanner;

public class SumReturnType {
    public static void main(StringExample[] args) {
        int ans = sum();
        System.out.println("Sum is: " +ans);
    }

     static int sum() {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter number 1:");
         int num1 = in.nextInt();
         System.out.print("Enter number 2:");
         int num2 = in.nextInt();
         int sum = num1 + num2;
         return sum;
    }
}
