package com.learning;
class Vehicle 
{
	int vid;
	String vtype;
	String vname;
	Vehicle(int id,String type,String name)
	{
		vid=id;
		vtype=type;
		vname=name;
	}
	Vehicle(Vehicle v2)
	{
		vid=v2.vid;
		vtype=v2.vtype;
		vname=v2.vname;
	}
	public void showDetails()
	{
		System.out.println("Vehicle ID:"+vid);
		System.out.println("Vehicle type:"+vtype);
		System.out.println("Vehicle name:"+vname);
		System.out.println("________________________");
	}
}
public class constructor3 
{
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle(101,"Car","Audi");
		v1.showDetails();
		Vehicle v2=new Vehicle(v1);
		v2.showDetails();
		Vehicle v3=new Vehicle(102,"Car","BMW");
		v3.showDetails();
	}
}