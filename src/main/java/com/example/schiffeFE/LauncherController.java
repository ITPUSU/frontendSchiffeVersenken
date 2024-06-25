package com.example.schiffeFE;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class LauncherController {
    @FXML
    private Launcher launcher = new Launcher();

    /*
    @FXML
    protected void onStartButtonClick() {
        welcomeText.setText("Welcome to ITPUSU Battleships");
        try {
            Launcher.initiateMenu();
        }catch(IOException exception) {
            throw new RuntimeException(exception);
        }
    }
} */

    @FXML
    public void quitGame() {
        launcher.close();
    }
}