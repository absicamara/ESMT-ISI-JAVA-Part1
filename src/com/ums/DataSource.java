package com.ums;


import com.ums.model.User;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import com.ums.model.Role;



public class DataSource {
	
	private ObservableList<User> users = FXCollections.observableArrayList();
	
	public DataSource() {
		
		users.add(new User("8ior","Ndeve","ndeye.diorMgmail.com","775231245", Role.SIMPLE_USER));
		users.add(new User("Yaffa","Mouhamed","mohamed.yaffa@gmail.com","773391555", Role.SIMPLE_USER));
		users.add(new User("5ow","8jiby","djiby.sow@gmail.com","78321205", Role.ADMINISTRATOR)); 
		users.add(new User("Fall","5eydina","seydina.fallMgmail.com","705121980", Role.SIMPLE_USER)); 
		users.add(new User("gona","Chafaa","chafaa.konaMgmail.com","773251007", Role.ADMINISTRATOR)); 
		users.add(new User("1,11","Yacine","yacine.tallggmail.com","780157896", Role.SIMPLE_USER)); 
		users.add(new User("5AME","Ridwane","ridwane.sameggmail.com","761250067", Role.ADMINISTRATOR)); 
		users.add(new User("5EME","Mamadou","mamadou.semeggmail.com","776356700", Role.ADMINISTRATOR)); 
		users.add(new User("8ieng","Mouhamed","mouhamed.dieng@gmail.com","708961209", Role.SIMPLE_USER)); 
		users.add(new User("8ahini","Freddy","freddy.bahiniMgmail.com","783361728", Role.SIMPLE_USER)); 
	}
	
	public ObservableList<User> getUsers(){
		
		return users;
	}

}
