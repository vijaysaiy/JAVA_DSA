package com.vijay.basics;

import java.util.Scanner;

/*
       Syntax of if statement
       if (boolean expression T or F){
               //body
        }else{
           //do this
         }
*/
public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Salary:");
        int salary = in.nextInt();
       if(salary > 10000){
           salary += 2000;
       } else{
           salary += 1000;
       }
        System.out.println("Salary with bonus is: "+salary );
        in.close();
    }
}
