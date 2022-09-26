package com.swathi.general;

//public class JDBCExample {
	import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
	import java.sql.Statement;

	public class JDBCExample {
	   static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=false;trustServerCertificate=false;";
	   static final String USER ="swathi";
	   static final String PASS ="Ssvv2022!";

	   public static void main(String[] args) {
	      // Open a connection
	      try {
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();		      
	         String sql = "select EmpID, EmpName from emp ";
	         ResultSet rs= stmt.executeQuery(sql);
	         while(rs.next())
	         {
	        	int empid=rs.getInt("EmpID");
	        	String empname=rs.getString("EmpName");
	        	System.out.println(empid + "\t"+ empname );   
	         }
	        	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


