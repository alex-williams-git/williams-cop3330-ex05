/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int first_number = Integer.parseInt(scan.nextLine());

        System.out.print("What is the second number? ");
        int second_number = Integer.parseInt(scan.nextLine());

        int first_answer = first_number + second_number;
        int second_answer = first_number - second_number;
        int third_answer = first_number * second_number;
        int fourth_answer = first_number / second_number;

        System.out.println(first_number + " + " + second_number + " = " + first_answer);
        System.out.println(first_number + " - " + second_number + " = " + second_answer);
        System.out.println(first_number + " * " + second_number + " = " + third_answer);
        System.out.println(first_number + " / " + second_number + " = " + fourth_answer);
    }
}
