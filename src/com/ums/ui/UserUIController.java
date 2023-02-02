package com.ums.ui;

import java.io.IOException;

import com.ums.DataSource;
import com.ums.UMSApplication;
import com.ums.model.User;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserUIController {

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
	private ComboBox<StringProperty> roleComboBox;
	@FXML
	private Button enregButton;
	@FXML
	private Button closeButton;

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
	@FXML
	private Button nouveauButton;
	@FXML
	private Button modifierButton;
	@FXML
	private Button supprimerButton;
	@FXML
	private Button quitterButton;

	private UMSApplication umsApplication;
	private CreateUserUIController createUserUIController;
	private EditUserUIController editUserUIController;
	private Stage stage;
	private Stage Editstage;
	private DataSource dataSource;

	public UserUIController() {
		// TODO Auto-generated constructor stub
		modifierButton = new Button();
		nouveauButton = new Button();
	}

	public void initialize() {
		nomColumn.setCellValueFactory(cellData -> cellData.getValue().getNom());
		prenomColumn.setCellValueFactory(cellData -> cellData.getValue().getPrenom());

		dataSource = new DataSource();

		userTable.setItems(dataSource.getUsers());

		clearFields();

		userTable.setOnMouseClicked(e -> {
			if (e.getClickCount() == 1) {
				User selected = userTable.getSelectionModel().getSelectedItem();
				nomLabel.setText(selected.getNom().getValue());
				prenomLabel.setText(selected.getPrenom().getValue());
				emailLabel.setText(selected.getEmail().getValue());
				telephoneLabel.setText(selected.getTelephone().getValue());
				loginLabel.setText(selected.getLogin().getValue());
				passwordLabel.setText(selected.getPassword().getValue());
				roleLabel.setText(selected.getRole().getValue());
			}

//			
//			Node node = (Node)e.getSource();
//	        Stage stage = (Stage)node.getScene().getWindow();
//	        stage.setOnShown(e2 -> {
//	        	userTable.refresh();
//	        });
//	        

		});

		nouveauButton.setOnAction(e -> {

			try {
				Stage currentStage = (Stage) nouveauButton.getScene().getWindow();
				stage = new Stage();
				createUserUIController = new CreateUserUIController(dataSource, currentStage);
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("CreateUserUI.fxml"));
				loader.setController(createUserUIController);
				Parent root = loader.load();

				// StackPane root = new StackPane();

				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();

				currentStage.hide();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		modifierButton.setOnAction(e -> {

			try {

				Stage currentStage = (Stage) modifierButton.getScene().getWindow();
				Editstage = new Stage();

				User userToEdit = userTable.getSelectionModel().getSelectedItem();
				int index = dataSource.getUsers().indexOf(userToEdit);

				editUserUIController = new EditUserUIController(dataSource, userToEdit, index, currentStage);

				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("CreateUserUI.fxml"));
				loader.setController(editUserUIController);
				Parent root;
				root = loader.load();
				Scene scene = new Scene(root);
				Editstage.setScene(scene);

				Editstage.show();
				currentStage.hide();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		supprimerButton.setOnMouseClicked(e -> {
			User selectedUser = userTable.getSelectionModel().getSelectedItem();
			int index = dataSource.getUsers().indexOf(selectedUser);
			dataSource.getUsers().remove(index);

		});

		quitterButton.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}

	public void clearFields() {
		nomLabel.setText("");
		prenomLabel.setText("");
		emailLabel.setText("");
		telephoneLabel.setText("");
		loginLabel.setText("");
		passwordLabel.setText("");
		roleLabel.setText("");
	}

	public void updateUI() {
		// TODO Auto-generated method stub
		userTable.refresh();

	}

}
