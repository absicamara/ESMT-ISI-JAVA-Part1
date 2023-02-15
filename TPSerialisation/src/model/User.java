package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
	
	private int identifiant;
	private String login;
	private String password;
	
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public User() {
		super();
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int id) {
		this.identifiant = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String login, String password) {
		super();
		this.identifiant = id;
		this.login = login;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + identifiant + ", login=" + login + ", password=" + password + "]";
	}
	
	
	
	

}
