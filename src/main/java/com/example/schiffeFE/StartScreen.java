package com.example.schiffeFE;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartScreen {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onStartButtonClick() {
        welcomeText.setText("Welcome to ITPUSU Battleships");
    }
}