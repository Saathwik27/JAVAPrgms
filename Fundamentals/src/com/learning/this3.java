package com.learning;
//use of this keyword inside method
class Dept
{
	String deptname="CS Dept";
	String collegename="ABC College Of Engineering";
	public void getCollegeName() 
	{
		System.out.println("College Name:"+this.collegename);
		this.collegeFee();
	}
	public void getDeptName()
	{
		System.out.println("Dept Name:"+this.deptname);
	}
	private void collegeFee()
	{
		System.out.println("27000/year");
		System.out.println("34000/year");
	}
}
public class this3 
{
	public static void main(String[] args) 
	{
		Dept dept=new Dept();
		dept.getCollegeName();
		dept.getDeptName();
	}
}