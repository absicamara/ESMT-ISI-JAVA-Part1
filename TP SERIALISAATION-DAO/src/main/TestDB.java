package main;

import java.sql.Connection;

import javax.swing.JOptionPane;

import connexionDB.DBManager;

public class TestDB {
	public void testConnexion() {
		try (Connection connection = DBManager.getConnection()) {
			JOptionPane.showMessageDialog (null, "Connexion à la base OK." );
			} catch (Exception e) {

			JOptionPane.showMessageDialog (null, e.getMessage(), "Error",

			JOptionPane.ERROR_MESSAGE );
			}
	}
	

}
