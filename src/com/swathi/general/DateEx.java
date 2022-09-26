package com.swathi.general;

/*import java.util.Date;
public class DateEx {
	public static void main(String args[])
	{
		Date currentdate=new Date();
		System.out.println(currentdate.toString());
	}

}*/
import java.util.*;
import java.text.*;
public class DateEx{
	public static void main(String args[])
	{
		Date nowdate=new Date();
		SimpleDateFormat sft=new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
		System.out.println("currentDate = "+sft.format(nowdate));
	}
}