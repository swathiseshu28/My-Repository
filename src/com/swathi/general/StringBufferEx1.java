package com.swathi.general;

public class StringBufferEx1 {
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer("welcome");
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		System.out.println(sb1.capacity());
		sb1.append("Hello\n");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append("Java is my favourite language");
		System.out.println(sb1);
		System.out.println(sb2.capacity());
		//System.out.println(sb2);
	}

}
