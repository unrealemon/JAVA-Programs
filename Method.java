package com.java.JavaProject1;

public class Method {
	
	public void Sum(int a, int b)
	{
		System.out.println("Summation: "+(a+b));
	}
	
	public void Sub(int a, int b)
	{
		System.out.println("Sbstraction: "+(a-b));
	}
	
	public void Mul(int a, int b)
	{
		System.out.println("Multiplication: "+(a*b));
	}
	
	public void Div(int a, int b)
	{
		System.out.println("Division: " +(a/b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method object = new Method();
		object.Sum(10,10);
		object.Sub(10,10);
		object.Mul(10,10);
		object.Div(10,10);
		
		

	}

}
