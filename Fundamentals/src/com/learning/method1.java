package com.learning;

public class method1 {
	public void m1() {
		System.out.println("m1 function executed");
	}
	public static void m2() {
		System.out.println("m2 function executed");
	}

	public static void main(String[] args) {
		method1 obj=new method1();
		obj.m1();
		method1.m2();
	}

}
