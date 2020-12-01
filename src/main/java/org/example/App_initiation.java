package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App_initiation extends Application {

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start ... ");

        //Texte AFPA
        Label afpa = new Label("Afpa FOREVER ...");
        afpa.setStyle("-fx-font-size: 30px; -fx-text-fill: white;");

        //Gestionnaire d'écoute texte AFPA
        afpa.setOnMouseEntered(evt -> afpa.setText("ok ..."));
        afpa.setOnMouseExited(evt -> afpa.setText("Afpa FOREVER ..."));

        //Texte modifié à l'appui du bouton
        Label label = new Label("");
        label.setStyle("-fx-font-size: 30px; -fx-text-fill: white;");

        //Bouton
        Button bouton = new Button("Clique moi !");

        //Gestionnaire d'écoute bouton
        bouton.setOnAction(evt -> label.setText("Cool ..."));

        // Panel spécifique avec agencement vertical des éléments
        VBox root = new VBox();
        root.setStyle("-fx-background-color: lightgreen;");

        // Ajoute les éléments au panel root
        root.getChildren().addAll(label,bouton,afpa);

        Scene scene = new Scene( root , 300 , 100 , Color.WHITE);

        // Titre de la page
        primaryStage.setTitle( "Un titre") ;
        primaryStage.setScene(scene) ;
        primaryStage.show() ;
    }
}