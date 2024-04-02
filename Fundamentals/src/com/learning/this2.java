package com.learning;
//to differenciate b/w instance variable and local variable when
//there is a naming confliction
class Emp
{
	int empid;
	String empname;
	Emp(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	public void show() 
	{
		System.out.println(this.empid+" "+this.empname);
	}
}
public class this2
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(101,"Arun");
		e1.show();
	}
}