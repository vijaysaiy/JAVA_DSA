package com.vijay.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.println("Leap year");
//                }
//                else{
//                    System.out.println("Not a leap year");
//                }
//            }else{
//                System.out.println("Leap year");
//            }
//        }
//        else{
//            System.out.println("Not a leap year");
//        }
        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
