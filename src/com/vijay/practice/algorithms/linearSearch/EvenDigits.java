package com.vijay.practice.algorithms.linearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,-7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        if(num < 0) {
            num *= -1;
        }
        if(num == 0) {
            count = 1;
        }
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    //optimised way to find digits

    static int digits2(int num){
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num) + 1);
    }

}
