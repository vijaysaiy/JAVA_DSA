package com.vijay.practice.algorithms.linearSearch;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,1},
                {18,12,3,9},
                {19,12}
        };
        int ans = findMax(arr);
        System.out.println(ans);
    }
    static int findMax(int[][] arr){

        int max = Integer.MIN_VALUE;
        for(int row =0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
