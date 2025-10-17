package com.oop.first.simplecalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class simplecalculatorController
{
    @javafx.fxml.FXML
    private TextField firstnumberTextfield;
    @javafx.fxml.FXML
    private TextField secondnumberTextfeild;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void mulOnaction(ActionEvent actionEvent) {
        int x  = Integer.parseInt(firstnumberTextfield.getText());
        int y  = Integer.parseInt(secondnumberTextfeild.getText());
        int z = x * y;
        resultLabel.setText(String.valueOf(z));

    }

    @javafx.fxml.FXML
    public void addOnaction(ActionEvent actionEvent) {
        int x  = Integer.parseInt(firstnumberTextfield.getText());
        int y  = Integer.parseInt(secondnumberTextfeild.getText());
        int z = x + y;
        resultLabel.setText(String.valueOf(z));
    }

    @javafx.fxml.FXML
    public void divOnaction(ActionEvent actionEvent) {
        int x  = Integer.parseInt(firstnumberTextfield.getText());
        int y  = Integer.parseInt(secondnumberTextfeild.getText());
        int z = x / y;
        resultLabel.setText(String.valueOf(z));
    }

    @javafx.fxml.FXML
    public void subOnaction(ActionEvent actionEvent) {
        int x  = Integer.parseInt(firstnumberTextfield.getText());
        int y  = Integer.parseInt(secondnumberTextfeild.getText());
        int z = x - y;
        resultLabel.setText(String.valueOf(z));
    }
}