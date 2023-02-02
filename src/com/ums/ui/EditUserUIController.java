package com.ums.ui;

import java.util.Iterator;

import com.ums.DataSource;
import com.ums.UMSApplication;
import com.ums.model.Role;
import com.ums.model.User;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditUserUIController {

	@FXML
	private TextField nomTextField;
	@FXML
	private TextField prenomTextField;
	@FXML
	private TextField emailTextField;
	@FXML
	private TextField telephoneTextField;
	@FXML
	private TextField loginTextField;
	@FXML
	private TextField passwordTextField;
	@FXML
	private ComboBox<Role> roleComboBox;
	@FXML
	private Button enregButton;
	@FXML
	private Button closeButton;

	private ObservableList<User> users;
	private User userToEdit;
	private int index;

	DataSource dataSource;
	Stage prevStage;
	
	private Role selectedRole = null;


//	public EditUserUIController(DataSource dataSourceArg, Stage stage) {
//
//
//
////		System.out.println(FXCollections.observableArrayList(Role.values()));
//	}

	public EditUserUIController(DataSource dataSourceArg, User userToEdit, int index, Stage prevStage) {
		
		this.dataSource = dataSourceArg;
		this.prevStage = prevStage;
		this.userToEdit = userToEdit;
		this.index = index;
		roleComboBox = new ComboBox<>();
		
	}

	public void initialize() {

		
		
//		fill in fields with user to edit
		nomTextField.setText(userToEdit.getNom().get());
		prenomTextField.setText(userToEdit.getPrenom().get());
		emailTextField.setText(userToEdit.getEmail().get());
		telephoneTextField.setText(userToEdit.getTelephone().get());
		loginTextField.setText(userToEdit.getLogin().get());
		passwordTextField.setText(userToEdit.getPassword().get());
		roleComboBox.getItems().setAll(Role.values());
		System.out.println(userToEdit.getRole().getValue());
		selectedRole = Role.valueOf(userToEdit.getRole().getValue());
//		
		roleComboBox.getSelectionModel().select(Role.valueOf(selectedRole.getValue()));	
		
		
		
		closeButton.setOnAction(event -> {
			Stage currentStage = (Stage) closeButton.getScene().getWindow();
			prevStage.show();
			currentStage.hide();
		});

		enregButton.setOnAction(event -> {
			Stage currentStage = (Stage) enregButton.getScene().getWindow();

			users = dataSource.getUsers();
			
			userToEdit.setPrenom(new SimpleStringProperty(prenomTextField.getText()));
			userToEdit.setNom(new SimpleStringProperty(nomTextField.getText()));
			userToEdit.setEmail(new SimpleStringProperty(emailTextField.getText()));
			userToEdit.setTelephone(new SimpleStringProperty(telephoneTextField.getText()));
			userToEdit.setLogin(new SimpleStringProperty(loginTextField.getText()));
			userToEdit.setPassword(new SimpleStringProperty(passwordTextField.getText()));
			userToEdit.setRole(new SimpleStringProperty(roleComboBox.getValue().toString()));

			users.set(index, userToEdit);
		
//			users.add(userToEdit);

			prevStage.show();
			currentStage.hide();

		});

	}
	


}
