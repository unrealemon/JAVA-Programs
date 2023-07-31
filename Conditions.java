package com.java.JavaProject1;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		if(num1>num2)
			System.out.print("Number one is greater");
		else if(num2>num1)
			System.out.print("Number two is greater");
		else
			System.out.print("Both numbers are equal");
			

	}

}
