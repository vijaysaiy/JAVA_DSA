package com.vijay.DS.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
         */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        //or directly
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //a 2d array can also be as
        int[][] arr2 ={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        //input
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //output using enhanced for loop

        for(int[] element : arr){
            System.out.println(Arrays.toString(element));
        }

    }
}
