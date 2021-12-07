package com.vijay.functions;

import java.util.Scanner;

public class SumNoReturnType {
    public static void main(StringExample[] args) {
        sum();
    }

    /*
        ---------------syntax----------------
        access modifier return_type name(arguments) {
            //body
            return statement;
        }
     */
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " +sum);
    }
}
