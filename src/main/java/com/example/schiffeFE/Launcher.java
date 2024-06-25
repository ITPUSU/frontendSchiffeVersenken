package com.example.schiffeFE;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// Initialisiere Java und JavaFX-Abläufe

public class Launcher extends Application {
    // Erstellen der Basis-Klasse für unser Programm

private Stage launcherStage;


   public void close() {
       launcherStage.close();
   }

    @Override
    public void start(Stage launcherStage) throws IOException {
        //Erstellen unserer Launcher-Stage
        this.launcherStage = launcherStage;
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("start-view.fxml"));
        Scene start = new Scene(fxmlLoader.load(), 800, 600);
        launcherStage.setTitle("Battleships");
        //Benennung unserer Stage

        launcherStage.setScene(start);
        launcherStage.show();
        //Anzeige der Start-Szene
    }

    public static void main(String[] args) {
        launch();
    }
    // Ermöglicht den Start unseres Programms
}