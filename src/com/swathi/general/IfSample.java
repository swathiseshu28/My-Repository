package com.swathi.general;

public class IfSample {
	public static void main(String args[])
	{
		int x,y;
		x=10;
		y=20;
		if(x<y)
		{
			System.out.println(x);
			System.out.println("x is less than y");
		}
		else if(true)
			System.out.println("Always true");	
		
		x=x*2;
		if(x==y)
		{
			System.out.println(x);
			System.out.println("x is equal to y");
		}
		x=x*2;
		if(x>y)
		{
			System.out.println(x);
			System.out.println("x is grater than y");
		}
		if(x==y)
		{
			System.out.println(x);
			System.out.println("you won't see this");
		}
	}

}
