package com.vijay.practice.basics;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it's weekday or weekend:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch(num){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7-> System.out.println("Weekend");
            default -> System.out.println("Enter valid number");
        }
    }
}
