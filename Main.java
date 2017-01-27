package com.company;

import java.util.Scanner;
//Latasha Marks
//Jan. 26,2017
// Reverse number
class Main {
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in); // Make a new Scanner which reads input from the keyboard

        int listNumber= 0;  // initialize
        int backWards=0;   //initialize


        System.out.println("Enter numbers ");// Enter put the numbers
        listNumber = scnr.nextInt(); // store information that was input


        while (listNumber != 0) //1find out the reverse number

        {
            backWards = backWards * 10; //
            backWards= backWards + listNumber%10;
            listNumber = listNumber/10;
        }


        System.out.println("Reverse of input number is: "+ backWards); // Print the number in reverse



    }
}

