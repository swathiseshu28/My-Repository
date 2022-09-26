package com.swathi.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreatetable {
	
	   //public class TestApplication {
	   static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=false;trustServerCertificate=false;";
	   static final String USER = "swathi";
	   static final String PASS = "Ssvv2022!";

	   public static void main(String[] args) {
	      // Open a connection
	      try {
	          Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	          Statement stmt = conn.createStatement();
	      		      
	          String sql = "CREATE TABLE REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	         System.out.println("Created table in given database...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


