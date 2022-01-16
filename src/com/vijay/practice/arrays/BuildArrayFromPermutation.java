package com.vijay.practice.arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args){
        int[] arr = {0,2,1,5,3,3};
        int ans[] = arrayBuilder(arr);
        System.out.print(Arrays.toString(ans));
    }
    static int[] arrayBuilder(int[] arr){
        int[] newArr = new int[arr.length];
        for(int index = 0; index < arr.length; index++){
            newArr[index] = arr[arr[index]];
        }
        return newArr;
    }
}
