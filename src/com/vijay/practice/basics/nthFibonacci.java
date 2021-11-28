package com.vijay.practice.basics;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        int count = 2;
        while(count <= n){
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(sum);
    }
}
