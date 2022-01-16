package com.vijay.practice.algorithms.linearSearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {23,34,45,1,2,8,19,-1,16,-11,28};
        System.out.println(min(arr));
    }
    //assuming arr.length != 0  => not an empty array
    //return the minimum value in the array
    static int min(int arr[]){

        int ans = arr[0];
        for(int i= 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
