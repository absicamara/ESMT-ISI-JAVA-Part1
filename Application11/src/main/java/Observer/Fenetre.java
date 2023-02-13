package Observer;

import Subject.FenetrePrincipale;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class Fenetre extends Observer{

    StackPane root = new StackPane();

    private Scene scene= new Scene(root,250, 250);;
    private Stage stage= new Stage();;


    Random rand ;


    public Fenetre(FenetrePrincipale fenetrePrincipale) {
        this.fenetrePrincipale = fenetrePrincipale;
        this.fenetrePrincipale.attach(this);

        Random rand = new Random();
        stage.setX(rand.nextInt(500));
        stage.setY(rand.nextInt(500));

        stage.setTitle("hey");
        stage.setScene(scene);
        stage.show();
    }

    public void createWindow(){


    }



    @Override
    public void update() {

        rand = new Random();

        double r = rand.nextDouble();
        double g = rand.nextDouble();
        double b = rand.nextDouble();
        Color randomColor = new Color(r, g, b, 1.0);

        root.setBackground(new Background(new BackgroundFill(randomColor, CornerRadii.EMPTY, Insets.EMPTY)));    }
}
