package com.oop.first.codewgaes;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerClass
{
    @javafx.fxml.FXML
    private TextField firstIntTF;
    @javafx.fxml.FXML
    private TextField firstImgTF;
    @javafx.fxml.FXML
    private TextField secondIntTF;
    @javafx.fxml.FXML
    private TextField secondImgTF;
    @javafx.fxml.FXML
    private Label resultLB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
        ModelClass c1 = new ModelClass(Integer.parseInt(firstIntTF.getText()), Integer.parseInt(firstImgTF.getText()));
        ModelClass c2 = new ModelClass(Integer.parseInt(secondIntTF.getText()),Integer.parseInt(secondImgTF.getText()));
        ModelClass c3 = new ModelClass();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;
        resultLB.setText(c3.toString());
    }

    @javafx.fxml.FXML
    public void subOA(ActionEvent actionEvent) {
        ModelClass c1 = new ModelClass(Integer.parseInt(firstIntTF.getText()), Integer.parseInt(firstImgTF.getText()));
        ModelClass c2 = new ModelClass(Integer.parseInt(secondIntTF.getText()),Integer.parseInt(secondImgTF.getText()));
        ModelClass c3 = new ModelClass();
        c3.real = c1.real - c2.real;
        c3.img = c1.img - c2.img;
        resultLB.setText(c3.toString());
    }
}