package com.swathi.general;

public class Area {
	
	
	public static void main(String args[])
	{
		System.out.println("Change for commit...");
		double pi,r,a;
		r=10.8;
		pi=3.1416;
		a=pi*r*r;
		System.out.println("Area of circle is :" +a);
	}
	
	static
	{
		System.out.println("Static Block");
	}

}
