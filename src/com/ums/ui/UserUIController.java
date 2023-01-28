package com.ums.ui;


import com.ums.DataSource;
import com.ums.model.User;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserUIController {
	
	@FXML
	private TableView<User> userTable;
	@FXML
	private TableColumn<User, String> nomColumn;
	@FXML
	private TableColumn<User, String> prenomColumn;
	@FXML
	private Label nomLabel;
	@FXML
	private Label prenomLabel;
	@FXML
	private Label emailLabel;
	@FXML
	private Label telephoneLabel;
	@FXML
	private Label loginLabel;
	@FXML
	private Label passwordLabel;
	@FXML
	private Label roleLabel;
	
	
	private DataSource dataSource;
	

	public UserUIController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void initialize() {
		nomColumn.setCellValueFactory(cellData -> cellData.getValue().getNom());
		prenomColumn.setCellValueFactory(cellData -> cellData.getValue().getPrenom());
		
		dataSource = new DataSource();
		
		userTable.setItems(dataSource.getUsers());
		

	}
	

}
