package com.oop.sectionsix.demo1;

import javafx.scene.control.Label;

public class DummyController
{
    @javafx.fxml.FXML
    private Label dummyLabel;

    @javafx.fxml.FXML
    public void initialize() {
        dummyLabel.setText("Good Morning");
    }}