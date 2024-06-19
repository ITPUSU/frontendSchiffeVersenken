package com.example.schiffeFE;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// Initialisiere Java und JavaFX-Abläufe

public class BattleShips extends Application {
    // Erstellen der Basis-Klasse für unser Programm

    @Override
    public void start(Stage stage) throws IOException {
        //Erstellen unserer StartPage-Stage

        FXMLLoader fxmlLoader = new FXMLLoader(BattleShips.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Battleships");
        //Benennung unserer Stage

        stage.setScene(scene);
        stage.show();
        //Anzeige der Szene
    }

    public static void main(String[] args) {
        launch();
    }
    // Ermöglicht den Start unseres Programms
}