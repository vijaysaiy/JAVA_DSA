package com.vijay.practice.basics;

import java.util.Scanner;

public class DisplayDay {
    public static void main(String[] args) {
        System.out.print("Enter number between 1 and 7 to know the day:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid number");
        }
        
    }
}
