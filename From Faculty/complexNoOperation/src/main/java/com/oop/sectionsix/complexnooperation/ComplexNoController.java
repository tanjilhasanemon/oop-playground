package com.oop.sectionsix.complexnooperation;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNoController
{
    @javafx.fxml.FXML
    private TextField imgValueOf1stTextfield;
    @javafx.fxml.FXML
    private TextField realValueOf1stTextfield;
    @javafx.fxml.FXML
    private TextField realValueOf2ndTextfield;
    @javafx.fxml.FXML
    private TextField imgValueOf2ndTextfield;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void subButtonOnAction(ActionEvent actionEvent) {
        ComplexNo c1 = new ComplexNo(Integer.parseInt(realValueOf1stTextfield.getText()), Integer.parseInt(imgValueOf1stTextfield.getText()));
        ComplexNo c2 = new ComplexNo(Integer.parseInt(realValueOf2ndTextfield.getText()), Integer.parseInt(imgValueOf2ndTextfield.getText()));
        ComplexNo c3 = new ComplexNo();
        c3.real = c1.real - c2.real;
        c3.img = c1.img - c2.img;
        resultLabel.setText(c3.toString());
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        ComplexNo c1 = new ComplexNo(Integer.parseInt(realValueOf1stTextfield.getText()), Integer.parseInt(imgValueOf1stTextfield.getText()));
        ComplexNo c2 = new ComplexNo(Integer.parseInt(realValueOf2ndTextfield.getText()), Integer.parseInt(imgValueOf2ndTextfield.getText()));
        ComplexNo c3 = new ComplexNo();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;
        resultLabel.setText(c3.toString());
    }
}