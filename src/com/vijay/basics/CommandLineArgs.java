package com.vijay.basics;

public class CommandLineArgs {
    public static void main(String[] args){
        if(args.length > 0) {
            System.out.println("Arguments are: ");
            String s1 = args[1];

            String s2 = args[2];

            String s3 = args[3];

            System.out.print("args[2] = " + s2);
        }
        else {
            System.out.println("No arguments");
        }
    }
}
