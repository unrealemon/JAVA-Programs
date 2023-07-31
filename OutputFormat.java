package com.java.JavaProject1;

import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your age: ");
		int number1 = input.nextInt();
		
		System.out.println(name);
		System.out.println(number1);

	}

}
