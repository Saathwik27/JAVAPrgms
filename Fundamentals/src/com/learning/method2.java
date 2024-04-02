package com.learning;
public class method2 
{
	public int m1()
	{
		return 10;
	}
	public String m2() 
	{
		return "HELLO";
	}
	public static void main(String[] args)
	{
		method2 obj=new method2();
		System.out.println(obj.m1());
		int result=obj.m1();
		System.out.println(result);
		String result2=obj.m2();
		System.out.println(result2.concat("World"));
		System.out.println(result2.length());
	}
}