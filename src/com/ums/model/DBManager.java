package com.ums.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
	
	private static Connection connection = null;
	
	public static Connection getConnection () throws Exception {
		try {
			// Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//Ouverture de la connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost./users", "root","root");
				
				return connection;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				throw new Exception ("Driver Class not found : '" + e.getLocalizedMessage() + "' ");
			
		} catch (SQLException e) {
			throw new Exception ("Unable to open connection with DB !");
			
		}
	}
	


}
