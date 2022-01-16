package com.vijay.algorithms.seaching.linearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args){
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},                    //if same values present in next row it will print indices of first
            {19,12}                         //ex: 12 is present in second[index = 1,1] and third row[index = 2,1) and ans will be [1,1]
        };
        int target = 2;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
