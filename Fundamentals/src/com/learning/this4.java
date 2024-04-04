package com.learning;
class Animal
{
	Animal()
	{
		this(10);
		System.out.println("Zero-arg constructor called");
	}
	Animal(int a)
	{
		System.out.println("one-arg constructor called");
	}
}
public class this4 
{
	public static void main(String[] args) 
	{
		Animal ani= new Animal();
	}
}