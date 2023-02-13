package Subject;

import Observer.Fenetre;
import Observer.Observer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class FenetrePrincipale {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    private Stage stage;
    Random rand;


    public FenetrePrincipale() {
        stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,250, 250);
        stage.setTitle("Accueil");
        stage.setScene(scene);
        stage.show();

        Button button = new Button("Change color");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                changeColor();

            }
        });

        Button button2 = new Button("Create new Window");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createWindow();
            }
        });

        Button button3 = new Button("Close all");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });


        VBox vbox = new VBox(button, button2,button3);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        root.getChildren().add(vbox);

        new Fenetre(this);


    }


    public  void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }

    public void changeColor() {
        notifyAllObservers();
    }

    public void createWindow(){
        new Fenetre(this);
    }
}
