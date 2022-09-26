package com.swathi.general;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MyClass7 {
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			
			String path;
			System.out.println("enter file name with path :");
			path=sc.nextLine();
			
			File f=new File(path);
			if(f.createNewFile())
				System.out.println("File is created");
			else
				System.out.println("File not exist");
			
			FileWriter fw=new FileWriter(f);
			fw.write("This is Swathi \n");
			fw.write("The class is going good");
			fw.close();
			
			System.out.println("File Writing is done");
		}
		catch(Exception ex)
		{
			System.out.println("Some error occured");
		}
	}

}
