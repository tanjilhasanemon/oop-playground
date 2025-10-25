package com.oop.first.comboboxpractice;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class comboBoxController
{
    @javafx.fxml.FXML
    private Label showmajorLabel;
    @javafx.fxml.FXML
    private ComboBox<String> majorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        majorComboBox.getItems().addAll("CSE", "BBA", "ENV", "INB");
    }

    @javafx.fxml.FXML
    public void showmajorOnAction(ActionEvent actionEvent) {
        String major = majorComboBox.getValue();
        showmajorLabel.setText(major);
    }

}