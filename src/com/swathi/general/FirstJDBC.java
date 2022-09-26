package com.swathi.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC {
	

	//public class FirstExample {
	   static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=false;trustServerCertificate=false;";
	   //static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";DESKTOP-8EFJS0H
	   static final String USER = "swathi";
	   static final String PASS = "Ssvv2022!";
	   static final String QUERY = "SELECT top 1 * FROM Emp order by id desc";

	   public static void main(String[] args) {
	      // Open a connection
	      try {
	    	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(" Salary: " + rs.getInt("salary"));
	            System.out.print(" name : " + rs.getString("name"));
	            System.out.println("address: " + rs.getString("address"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	        } 
     }
}
