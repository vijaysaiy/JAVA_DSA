package com.vijay.practice.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,1};
    int[] ans = concatenateArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] concatenateArray(int[] arr) {
        int[] ans = new int[2* arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        return ans;
    }
}
