package com.learning;
import java.util.Scanner;
class Car1 
{
	int cid;
	String cname;
	String ccolor;
	Car1(int id,String name,String color)
	{
		cid=id;
		cname=name;
		ccolor=color;
	}
	public void showDetails() 
	{
		System.out.println("Car ID:"+cid);
		System.out.println("Car Name:"+cname);
		System.out.println("Car Color:"+ccolor);
	}
}
public class userinput
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car id:");
		int id=sc.nextInt();
		System.out.println("Enter the car name:");
		String name=sc.next();
		System.out.println("Enter the car color:");
		String color=sc.next();
		Car1 c1=new Car1(id,name,color);
		c1.showDetails();
		sc.close();
	}
}