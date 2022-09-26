package com.swathi.general;

import java.io.File;
import java.io.FileWriter;

public class MyClass8 {
	public static void main(String args[])
	{
		try 
		{
			File f=new File("D:\\SL\\MyFiles\\Hello.txt");
			if(f.createNewFile())
				System.out.println("File is created");
			else
				System.out.println("File already exists");
			
			FileWriter fw=new FileWriter(f);
			fw.write("This is swathi\n");
			fw.write("The class is going good");
			fw.close();
			
			System.out.println("File writing is done");
		}
		catch(Exception ex)
		{
			System.out.println("some error occured");
		}
	}

}
