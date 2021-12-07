package com.vijay.practice.functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return sum == original;
    }
}
