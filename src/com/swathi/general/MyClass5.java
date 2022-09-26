package com.swathi.general;

public class MyClass5 {
	
	public static int[] data = new int[] {5,6,7,8,9};
	
	public enum Day
	{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	public static void main(String args[])
	{
		Day today = Day.SUNDAY;
		 if(today==Day.SUNDAY)
			 System.out.println("Holiday");
		 else
			 System.out.println("working Day");
		 
		 for(Day d : Day.values())
			 System.out.println(d);
		 
		 today=Day.MONDAY;
		 
		 switch(today)
		 {
		 case SUNDAY :
			 System.out.println("To Day is Holiday");
			 break;
		 case MONDAY :
			 System.out.println("To Day is Working Day");
			 break;
		 default :
		 		System.out.println("some working day");
		 		break;
			 
		 }
		 for(var d : data)
		 {
			 System.out.println(d);
		 }
	}

}
