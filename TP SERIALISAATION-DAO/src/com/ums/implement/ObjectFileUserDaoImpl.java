package com.ums.implement;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import com.ums.dao.IDAO;
import com.ums.entity.User;
import com.ums.entity.Users;

import exceptions.DAOException;

public class ObjectFileUserDaoImpl implements IDAO<User> {

	private Users usersSerializable = new Users(); 
	
	
	
	public ObjectFileUserDaoImpl() {
		super();
		if (!(new File("user.ser").exists())) {
			try { 
				usersSerializable.serialiserUser("user.ser", usersSerializable); }
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			}
		}
	}

	@Override
	public void create(User entity) throws DAOException {
		try {
			Users users = usersSerializable.deserialiserUsers("user.ser");
			users.getUsers().add(entity);
			
			
			usersSerializable.serialiserUser("user.ser", users);
		} catch (ClassNotFoundException | IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	@Override
	public User read(int id) throws DAOException {
		try {
			//1 - DesdeserialiserUsers
			Users users = usersSerializable.deserialiserUsers("user.ser");
			
			//2 - Rechercher id user list
			Optional<User> userOptional = users.getUsers().stream().filter(t -> t.getIdentifiant() == id).findFirst();
			
			if (userOptional.isPresent()) {
				return userOptional.get();
			}else {
				throw new DAOException("Id de l'utilisateur non trouvé");
			}
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<User> list() throws DAOException {
		//1 - DesdeserialiserUsers
		try {
			Users users = usersSerializable.deserialiserUsers("user.ser");
			return users.getUsers();
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(User entity) throws DAOException {
		//1 - Deserialiser
		try {
			Users users = usersSerializable.deserialiserUsers("user.ser");
			
			//2 - Modifier (Recherche de l'entity)
			//Optional<User> userOptional = users.getUsers().indexOf(entity).filter(t -> t.getIdentifiant() == id).findFirst();
			
			int index = IntStream.range(0, users.getUsers().size())
					.filter(i -> users.getUsers().get(i).getIdentifiant() == entity.getIdentifiant())
	                .findFirst()
	                .orElse(-1);
			
			if(index != -1) {
				users.getUsers().get(index).setLogin(entity.getLogin());
				users.getUsers().get(index).setPassword(entity.getPassword());
				
				//Serialiser
				usersSerializable.serialiserUser("user.ser", users);
			}else {
				throw new DAOException("Id de l'utilisateur non trouvé");
			}
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) throws DAOException {
		try {
			Users users = usersSerializable.deserialiserUsers("user.ser");
			
			users.getUsers().removeIf(t -> t.getIdentifiant() == id);
			//Serialiser
			usersSerializable.serialiserUser("user.ser", users);
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
