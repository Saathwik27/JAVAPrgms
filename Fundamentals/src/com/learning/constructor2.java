package com.learning;
class Product
{
	int productid=101;
	String productname="MacBook";
	public Product(int id,String name) 
	{
		productid=id;
		productname=name;
	}
	public void showDetails() 
	{
		System.out.println("Product ID: "+productid+ " Product Name: " +productname);
	}
}
public class constructor2 
{ 
	public static void main(String[] args) 
	{
		Product p1=new Product(101,"MacBook");
		Product p2=new Product(102,"Dell");
		p1.showDetails();
		p2.showDetails();
	}
}