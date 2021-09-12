/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("What is the first number?");
        int num1 = keyboardInput.nextInt();

        System.out.print("What is the second number?");
        int num2 = keyboardInput.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1/num2));




    }
}
