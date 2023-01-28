package com.ums.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty email;
	private StringProperty telephone;
	private StringProperty login;
	private StringProperty password;
	private StringProperty role;
	
	

	public User(String nom, String prenom, String email, String telephone, Role role) {
		
		this.setNom(new SimpleStringProperty(nom));
		this.setPrenom(new SimpleStringProperty(prenom));
		this.setEmail(new SimpleStringProperty(email));
		this.setTelephone(new SimpleStringProperty(telephone));
		
		// login et password par défaut ...
		this.setLogin(new SimpleStringProperty(prenom.trim().toLowerCase() + "." +
		nom.trim().toLowerCase()));
		this.setPassword(new SimpleStringProperty("p@Ss3R"));
		this.setRole(new SimpleStringProperty(role.getValue()));
	}



	public StringProperty getNom() {
		return nom;
	}



	public void setNom(StringProperty nom) {
		this.nom = nom;
	}



	public StringProperty getPrenom() {
		return prenom;
	}



	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}



	public StringProperty getEmail() {
		return email;
	}



	public void setEmail(StringProperty email) {
		this.email = email;
	}



	public StringProperty getTelephone() {
		return telephone;
	}



	public void setTelephone(StringProperty telephone) {
		this.telephone = telephone;
	}



	public StringProperty getLogin() {
		return login;
	}



	public void setLogin(StringProperty login) {
		this.login = login;
	}



	public StringProperty getPassword() {
		return password;
	}



	public void setPassword(StringProperty password) {
		this.password = password;
	}



	public StringProperty getRole() {
		return role;
	}



	public void setRole(StringProperty role) {
		this.role = role;
	}

}
