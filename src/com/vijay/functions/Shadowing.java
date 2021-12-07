package com.vijay.functions;

public class Shadowing {
    static int x = 10;  //this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); //10
        int x = 40;
        /* or
            int x;   //shadowing will begin here;i.e.. right after declaration
            x = 40;
         */
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    //take away: local variables takes precedence
    //Shadowing begins right after declaration
}
