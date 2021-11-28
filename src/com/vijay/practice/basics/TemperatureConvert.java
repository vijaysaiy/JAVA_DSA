package com.vijay.practice.basics;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        System.out.println("Convert Temperature (Celsius to Fahrenheit)");
        System.out.print("Enter Temperature in C: ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF = (tempC * 1.8f) + 32;
        System.out.println("Temperature in Fahrenheit: " +tempF);
    }
}
