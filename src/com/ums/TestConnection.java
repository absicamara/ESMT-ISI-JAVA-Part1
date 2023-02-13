package com.ums;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.ums.model.DBManager;

public class TestConnection {

	public static void connect() {
		try (Connection connection = DBManager.getConnection()) {
			JOptionPane.showMessageDialog(null, "Connexion à la base OK.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static  void getAllUsers() throws Exception {
		
		try {
			Connection connection = DBManager.getConnection();
			Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users"); 
           // Process the result set
           while (resultSet.next()) {
               int id = resultSet.getInt("id");
               String nom = resultSet.getString("nom");
//               System.out.println("id: " + id + ", name: " + nom);
           }
           
//           connection.close();
			
		}catch(SQLException e){
			System.out.println("Connection failed.");
            e.printStackTrace();
            return;
		}
		
	}
}