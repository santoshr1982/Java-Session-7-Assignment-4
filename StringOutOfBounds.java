package com.String.Classes;
//This program has been written to display the string array out of bounds exception.
import java.util.Scanner;

public class StringOutOfBounds {

	public static void main(String[] args) {
		
		String strSample;									//Declaring the string.
		Scanner objScanner = new Scanner(System.in);		//Creating an object of array.
		
		System.out.println("Enter a string:");				//Requesting you to input string.
		strSample = objScanner.next();						//Accepting input.
		
		try{												//Try Block.
			int intLength = strSample.length();				//Length of the array assigned to a variable.
			System.out.println(strSample.charAt(intLength + 1));//Trying to print the index above length.
		}catch(StringIndexOutOfBoundsException e)				//Catching the error.
		{
			System.out.println("The index you are trying to axis is above the index limit."); //Printing the error.
		}
		
	}
	
}
