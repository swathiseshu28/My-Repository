package com.swathi.general;

public class MyClass2 {
	public static void main(String args[])
	{
		try
		{
			String data="5";
			
			int a=Integer.parseInt(data);
			
			int age=150,b=0,c;
			
			if(age>100)
				throw(new ArithmeticException("Age cannot be greter than 100"));
			else
				c=a/age;
				
			System.out.println(c);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Only Numbers are allowed");
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			//("Cannot divide with zero");
		}
		catch(Exception ex)
		{
			System.out.println("Some error occured. Please contact abc");
		}
		finally
		{
			System.out.println("Thank you for using calculator");
		}
	}

}
