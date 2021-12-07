package com.vijay.practice.basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a StringExample: ");
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("First letter of the string is Lower case");
        }else{
            System.out.println("First letter of the string is Upper case");
        }
    }
}
