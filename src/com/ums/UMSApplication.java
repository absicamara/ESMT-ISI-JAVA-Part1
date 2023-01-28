package com.ums;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UMSApplication extends Application {
	
	private Stage primaryStage;
	private BorderPane mainUI;
	private AnchorPane userUI;
	
	

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("User Management System");
		initRootLayout();
		showUserUI();
		
	}

	private void initRootLayout() {
		try {
			// Load root layout from fxml file.
			mainUI = (BorderPane) FXMLLoader.load(getClass().getResource("ui/MainUI.fxml"));
			// Show the scene containing the root layout.
			Scene scene = new Scene(mainUI);
			primaryStage.setScene(scene);
			primaryStage.show();
			} catch (IOException e) { e.printStackTrace(); }
		
	}

	private void showUserUI() {
		try {
			// Load userUI
			userUI = (AnchorPane) FXMLLoader.load(getClass().getResource("ui/UserUI.fxml"));
			// Set userUI into the center of root layout.
			mainUI.setCenter(userUI);
			} catch (IOException e) { e.printStackTrace(); }
		
	}
	
	// Returns the main stage.
	public Stage getPrimaryStage() {
	return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
