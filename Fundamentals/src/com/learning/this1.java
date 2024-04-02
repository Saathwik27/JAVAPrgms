package com.learning;
class Point
{
	Point()
	{
		System.out.println("Current value of this--->"+this);
	}
	public void check(Point b1) 
	{
		if(this==b1) 
		{
			System.out.println("Points to same");
		}
		else
		{
			System.out.println("Points to different object");
		}
	}
}
public class this1 
{
	public static void main(String[] args) 
	{
		Point b1=new Point();
		System.out.println("Current value of b1--->"+b1);
		b1.check(b1);
	}
}