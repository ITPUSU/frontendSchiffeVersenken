package com.example.schiffeFE;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// Initialisiere Java und JavaFX-Abläufe

public class BattleShip extends Application {
    // Erstellen der Basis-Klasse für unser Programm

static Stage startfx;

    @Override
    public void start(Stage startfx) throws IOException {
        //Erstellen unserer StartSeite-Stage
        this.startfx = startfx;
        FXMLLoader fxmlLoader = new FXMLLoader(BattleShip.class.getResource("start-view.fxml"));
        Scene start = new Scene(fxmlLoader.load(), 800, 600);
        startfx.setTitle("Battleships");
        //Benennung unserer Stage

        startfx.setScene(start);
        startfx.show();
        //Anzeige der Start-Szene
    }

    public static void initiateMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BattleShip.class.getResource("menu-view.fxml"));
        Scene menu = new Scene(fxmlLoader.load(), 800, 600);
        startfx.setScene(menu);
        startfx.show();

    }

    public static void main(String[] args) {
        launch();
    }
    // Ermöglicht den Start unseres Programms
}