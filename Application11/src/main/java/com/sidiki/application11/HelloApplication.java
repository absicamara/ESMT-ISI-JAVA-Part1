package com.sidiki.application11;

import Subject.FenetrePrincipale;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();

    }

    public static void main(String[] args) {
        launch();
    }
}