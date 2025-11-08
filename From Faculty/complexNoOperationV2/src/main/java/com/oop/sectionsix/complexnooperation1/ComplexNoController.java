package com.oop.sectionsix.complexnooperation1;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNoController
{
    @javafx.fxml.FXML
    private TextField realOf1stNumberTextfield;
    @javafx.fxml.FXML
    private TextField imgOf2ndNumberTextfield;
    @javafx.fxml.FXML
    private TextField realOf2ndNumberTextfield;
    @javafx.fxml.FXML
    private TextField imgOf1stNumberTextfield;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
        System.out.println("Good morning");
    }

    @javafx.fxml.FXML
    public void subButtonOnAction(ActionEvent actionEvent) {
        ComplexNo c1 = new ComplexNo(Integer.parseInt(realOf1stNumberTextfield.getText()), Integer.parseInt(imgOf1stNumberTextfield.getText()));
        ComplexNo c2 = new ComplexNo(Integer.parseInt(realOf2ndNumberTextfield.getText()), Integer.parseInt(imgOf2ndNumberTextfield.getText()));
        ComplexNo c3 = c1.sub(c2);
        System.out.println(c3);
        resultLabel.setText(c3.toString());
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        ComplexNo c1 = new ComplexNo(Integer.parseInt(realOf1stNumberTextfield.getText()), Integer.parseInt(imgOf1stNumberTextfield.getText()));
        ComplexNo c2 = new ComplexNo(Integer.parseInt(realOf2ndNumberTextfield.getText()), Integer.parseInt(imgOf2ndNumberTextfield.getText()));
        ComplexNo c3 = c1.add(c2);
        System.out.println(c3);
        resultLabel.setText(c3.toString());
    }
}