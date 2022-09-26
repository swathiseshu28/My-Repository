package com.swathi.general;

public class MyClass3 {
	public static void division() throws ArithmeticException
	{
		int a=45, b=0, rs;
		rs=a/b;
		System.out.println("Result = "+rs);
	}
	public static void addition() throws ArithmeticException
	{
		int a=45, b=0, rs;
		rs=a/b;
		System.out.println("Result = "+rs);
	}
	public static void main(String args[])
	{
		try
		{
			division();
			addition();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("some error occured");
		}
	}

}
