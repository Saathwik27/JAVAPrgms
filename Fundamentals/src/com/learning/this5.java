package com.learning;
 class A
 {
	 int a=10;
	 public void m1() 
	 {
		 int a=20;
		 System.out.println(a);
		 System.out.println(this.a);
	 }
 }
public class this5
{
	public static void main(String[] args)
	{
		new A().m1();
	}
}