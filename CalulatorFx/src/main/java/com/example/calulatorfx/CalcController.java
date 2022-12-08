package com.example.calulatorfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {
    @FXML
    private Label Text;

    @FXML
    protected void Click() {
        Text.setText("Welcome to JavaFX Application!");
    }
}