package com.oop.sectionsix.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label hiddenLabel;

    @FXML
    protected void onHelloButtonClick() {
        hiddenLabel.setText("Welcome to JavaFX Application!");
    }
}