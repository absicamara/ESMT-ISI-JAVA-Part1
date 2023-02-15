package main;

import com.ums.dao.IDAO;
import com.ums.entity.User;
import com.ums.implement.ObjectFileUserDaoImpl;

import exceptions.DAOException;

public class DemoObjectFileUser {

	public static void main(String[] args) {

		IDAO<User> dao;
		
		dao = new ObjectFileUserDaoImpl();
		
		try {
			dao.create(new User(1, "miraide", "123"));
			//List all users 
			System.out.println("La liste des utilisateurs: " +dao.list());
		} catch (DAOException e) {
			e.printStackTrace();
		}	
	}

}
