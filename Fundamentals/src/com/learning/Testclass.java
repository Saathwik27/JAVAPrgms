package com.learning;
class car
{
	int now=4;
	String color="red";
	String brand="Honda";
}
public class Testclass 
{
	public static void main(String[] args)
	{
		car civic=new car();
		System.out.println(civic.now);
		System.out.println(civic.color);
		System.out.println(civic);
		System.out.println(civic.brand);
	}
}