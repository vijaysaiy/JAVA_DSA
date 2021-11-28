package com.vijay.practice.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
