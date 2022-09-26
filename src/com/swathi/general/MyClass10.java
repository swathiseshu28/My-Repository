package com.swathi.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.util.Scanner;
import java.io.FileInputStream;

public class MyClass10 {
	public static void main(String args[])
	{
		/*try
		{
			File f=new File("D:\\SL\\MyFiles\\Hello.txt");
			
			//FileReader fr=new FileReader(f);
			FileInputStream fis=new FileInputStream(f);
			int ch=fis.read();
			while(ch!=-1)
			{
				System.out.println((char)ch);
				ch=fis.read();
			}
			fis.close();
			System.out.println("File reading is done");
		}
		catch(Exception ex)
		{
			
		}*/
		/*try
		{
			File f=new File("D:\\SL\\MyFiles\\Hello.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			
			String ch=br.readLine();
			while(ch!=null)
			{
				System.out.println(ch);
				ch=br.readLine();
			}
					
		}
		catch(Exception ex)
		{
			
		}*/
		try
		{
			List<String> data=Files.readAllLines(Paths.get("D:\\SL\\MyFiles\\Hello.txt"));
			
			for(var v:data)
				System.out.println(v);
		}
		catch(Exception ex)
		{
			
		}
	}

}
