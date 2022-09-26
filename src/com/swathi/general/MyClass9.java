package com.swathi.general;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
//import java.util.Scanner;

public class MyClass9 {
	public static void main(String args[])
	{
		try
		{
			String data="This is Java Class";
			File f=new File("D:\\SL\\MyFiles\\Hello.txt");
			/*FileOutputStream fos=new FileOutputStream(f);
			fos.write(data.getBytes());
			fos.close();*/
			FileWriter fw=new FileWriter(f,true);
			fw.write("\nHello\n");
			fw.write("I want my previous values" );
			//fw.write("File writing is easy");
			fw.close();
			System.out.println("File writing is done");
		}
		catch(Exception ex)
		{
			System.out.println("some error occured");
		}
	}

}
