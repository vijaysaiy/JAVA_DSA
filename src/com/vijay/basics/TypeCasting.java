package com.vijay.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        *int can be entered because int is compatible with float(int < float)
        *this is automatic type conversion
        *but vice versa is not possible
        *
        */
//        float num = input.nextFloat();
//        System.out.println(num);

        //Explicit type casting
//        int num = (int)(23.24f);
//        System.out.println(num); //output is 23

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 =1
//        System.out.println(b); //output is 1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);
    }
}
