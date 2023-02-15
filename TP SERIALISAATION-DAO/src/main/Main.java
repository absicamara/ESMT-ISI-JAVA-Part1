package main;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.ums.dao.IDAO;
import com.ums.entity.User;
import com.ums.implement.UserDaoImpl;


import exceptions.DAOException;

public class Main {

	public static void main(String[] args) throws DAOException {
		try {
			TestDB test = new TestDB();
			test.testConnexion();
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		IDAO<User> dao;
		
		dao = new UserDaoImpl();
		//Create a user
		dao.create(new User("miraide", "123"));
		//List all users 
		System.out.println("La liste des utilisateurs: " +dao.list());
		
		
		//Delete user by id
		dao.delete(4);
		//Read user by id
		System.out.println(dao.read(1));
		//Update User by id
		//dao.update();
	}
}
