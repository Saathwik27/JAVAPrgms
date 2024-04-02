package com.learning;

class Box2{
	static int length=30;
}

public class variable2 {

	public static void main(String[] args) {
	System.out.println(Box2.length);
	//using object we can access static variables.
	Box2 box=new Box2();
	Box2 box1=new Box2();
	Box2 box2=new Box2();
	System.out.println(box.length);
	System.out.println("Before modification");
	System.out.println(box.length);
	System.out.println(box1.length);
	System.out.println(box2.length);
	box1.length=40;
	System.out.println("After modification");
	System.out.println(box.length);
	System.out.println(box1.length);
	System.out.println(box2.length);
	}

}
