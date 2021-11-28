package com.vijay.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            -----Syntax of for loop:-------
            for(initialisation;condition;increment/decrement){
                //body
            }
        */
        System.out.println("\nIn for loop");
        for(int n = 1; n <= 5; n++){
            System.out.print(n + " ");
        }
        //Q:Print numbers from 1 to n
        System.out.print("\nEnter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

        /*
        ---- Syntax for while loop -----
        while(condition){
            //body
            //increment or decrement
         }
         */
        //Q: Print numbers from 0 to 5

        int num = 1;
        System.out.println("\nIn while loop");
        while(num <= 5){
            System.out.print(num + " ");
            num++;
        }
    }
}
