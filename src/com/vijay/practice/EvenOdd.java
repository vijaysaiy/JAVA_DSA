package com.vijay.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Check if number is Even or Odd?");
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
