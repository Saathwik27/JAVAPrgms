package com.learning;

class Box
{
	int length=20; //instance variable
}
public class variable1 
{
	public static void main(String[] args) 
	{
		Box B1=new Box();
		Box B2=new Box();
		Box B3=new Box();
		System.out.println(B1.length);
		System.out.println("-------------------");
		System.out.println("Before Modification");
		System.out.println(B1.length);
		System.out.println(B2.length);
		System.out.println(B3.length);
		System.out.println("After Modification");
		B1.length=40;
		B2.length=30;
		B3.length=50;
		System.out.println(B1.length);
		System.out.println(B2.length);
		System.out.println(B3.length);
	}
}