package com.vijay.basics;
/*
---------Primitive Data Types-----------
*  Data types which cannot be broken down further
    Ex:int,float,long,char,double.boolean
    ->by default all decimal numbers are double
    ->so if you want to save it as float add f or F at the end;
    ->by default all numbers are of int type
    ->so if you want to save it as long,add l or L at the end
---------Non Primitive Data Types--------
* Data types which can be broken down further
    Ex:A String  can be broken down into characters
-----------Literals and Identifiers-------
* int a = 10;
->Here 10 is literal and a is identifier
*/

public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64;
        byte marks1 = 99;
        char letter = 'v';
        float marks = 98.67f;
        double largeDecimalNumbers = 45678342.564;
        long largeInteger = 3429834791738732L;
        boolean isAvailable = false;
        //to write in a thousand format
        int num = 200_100_100;
        System.out.println(rollNo+" "+letter+" "+marks+" "+largeInteger+" "+largeDecimalNumbers +" "+ isAvailable + " " + marks1);
    }
}

/* ranges
    byte -> -127 to 127 or -2^7 to (2^7)-1  can be used for marks because they are up to 100
    short -> -32768 to 32767 or -2^15 to (2^15)-1
    int -> -2^31 to (2^31)-1
    long -> -2^63 to (2^63)-1
    float -> single precision 32bit numbers
    double -> double precision 32bit numbers
    char -> 16 bit unicode characters 0 to (2^16)-1
 */
