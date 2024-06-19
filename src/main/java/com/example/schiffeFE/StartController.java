package com.example.schiffeFE;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;


public class StartController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onStartButtonClick() {
        welcomeText.setText("Welcome to ITPUSU Battleships");
        try {
            BattleShip.initiateMenu();
        }catch(IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}