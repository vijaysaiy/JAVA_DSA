package com.vijay.practice.basics;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        //Q: Print largest of three numbers
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);
    }

}
