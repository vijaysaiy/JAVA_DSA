package com.vijay.practice.algorithms.linearSearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                {1,2,3},
                {3,2,1}
        };
        int ans = findMaxWealth(accounts);
        System.out.println(ans);
    }
    static int findMaxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int rowSum = 0;
            //when you start a new column take a new sum
            for(int account = 0; account < accounts[person].length;account++){
                rowSum += accounts[person][account];
            }
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
