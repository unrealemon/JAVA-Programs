package com.java.JavaProject1;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the first string");
		String String1 = input.nextLine();
		System.out.print("Enter the second string");
        String String2 = input.nextLine();
        
        if(String1.equalsIgnoreCase(String2))
        	System.out.println("Both strings are same");
        else
        	System.out.println("Both strings are not same");
	}

}
