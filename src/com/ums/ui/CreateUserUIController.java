package com.ums.ui;

import java.io.Console;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateUserUIController {

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
	private User userToCreate;

	DataSource dataSource;
	Stage prevStage;

	public CreateUserUIController(DataSource dataSourceArg, Stage stage) {

		this.dataSource = dataSourceArg;
		this.prevStage = stage;
		roleComboBox = new ComboBox<>();
		userToCreate = new User();


//		System.out.println(FXCollections.observableArrayList(Role.values()));
	}

	public void initialize() {

		roleComboBox.getItems().setAll(Role.values());
		roleComboBox.getSelectionModel().select(Role.SIMPLE_USER);
		
		

		closeButton.setOnAction(event -> {
			Stage currentStage = (Stage) closeButton.getScene().getWindow();
			prevStage.show();
			currentStage.hide();

		});

		enregButton.setOnAction(event -> {
			Stage currentStage = (Stage) enregButton.getScene().getWindow();

			users = dataSource.getUsers();

			userToCreate = new User(nomTextField.getText(), prenomTextField.getText(), emailTextField.getText(),
					telephoneTextField.getText(), roleComboBox.getValue());

			if (!isEmpty(userToCreate)) {
				System.out.println(isEmpty(userToCreate));
				users.add(userToCreate);
			}else {
				Alert popup = new Alert(Alert.AlertType.INFORMATION);
				popup.setTitle("Erreur");
				popup.setHeaderText(null);
				popup.setContentText("Veuillez renseigner les champs");

				popup.showAndWait();
			}
			

			prevStage.show();
			currentStage.hide();

		});

	}

	public boolean isEmpty(User user) {
		if (nomTextField.getText().isEmpty() || prenomTextField.getText().isEmpty()
				|| emailTextField.getText().isEmpty() || loginTextField.getText().isEmpty() || passwordTextField.getText().isEmpty())
			return true;
		return false;
	}

}
