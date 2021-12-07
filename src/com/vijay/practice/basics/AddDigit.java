package com.vijay.practice.basics;

public class AddDigit {
    public static void main(String[] args) {
                int ans = addDigits(9);
        System.out.println(ans);
    }
        public static int addDigits(int num) {
            if(num == 0) return 0;
            if(num % 9 == 0) return 9;
            return(num % 9);
        }
    }

