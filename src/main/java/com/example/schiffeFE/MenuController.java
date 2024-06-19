package com.example.schiffeFE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.schiffeFE.BattleShip.startfx;


public class MenuController {
    @FXML
    private Label menuText;

    @FXML
    protected void onMenuButtonClick() {
        menuText.setText("SceneSwap works");
    }

    @FXML
    public void quitGame() {
        startfx.close();
    }
}