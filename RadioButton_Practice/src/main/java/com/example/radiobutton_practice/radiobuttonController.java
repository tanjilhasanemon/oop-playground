package com.example.radiobutton_practice;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class radiobuttonController
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private RadioButton othersRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup groupA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showOnAction(ActionEvent actionEvent) {
        if (maleRadioButton.isSelected()){
            outputLabel.setText("You are a male!");
        }else if (femaleRadioButton.isSelected()){
            outputLabel.setText("You are a dishwasher!");
        }else if (othersRadioButton.isSelected()){
            outputLabel.setText("Fuck off!!!");
        }else outputLabel.setText("Select your gender first!");
    }
}