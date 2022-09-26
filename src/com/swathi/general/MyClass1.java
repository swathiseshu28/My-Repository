package com.swathi.general;

//import java.util.NumberFormatException;
import java.util.Scanner;

public class MyClass1 {
	public static void main(String args[])
	{
		String ch="y";
		Scanner obj=new Scanner(System.in);
		do
		{
			try
			{
				int a, b, c;
				System.out.println("Enter first number: ");
				a=Integer.parseInt(obj.nextLine());
				System.out.println("Enter second number: ");
				b=Integer.parseInt(obj.nextLine());
				c=a/b;
				System.out.println("Ans = " +c);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Please double check and enter only number");
			}
			System.out.println("Do you want to try again(y/n): " );
			ch=obj.nextLine();
		}
		while(ch.equalsIgnoreCase("y"));
		System.out.println("Thank you for using calculator");
		obj.close();
	}

}
