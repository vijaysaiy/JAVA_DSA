package com.vijay.practice.basics;

import java.util.Scanner;

public class SumWhenInterrupted {
    public static void main(String[] args) {
        System.out.println("Please keep entering numbers and enter 0 when you want to stop:");
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        while((num = input.nextInt()) != 0){
            sum = sum + num;
        }
        System.out.println("The sum of numbers: " +sum);
    }
}
