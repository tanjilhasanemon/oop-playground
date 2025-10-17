package com.oop.first.printname;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class printnameController
{
    @javafx.fxml.FXML
    private TextField lastnameTextfield;
    //This text field will take last name as input.
    @javafx.fxml.FXML
    private TextField middlenameTextfield;
    //This text field will take middle name as input.
    @javafx.fxml.FXML
    private TextField firstnameTextfield;
    //This text field will take first name as input.
    @javafx.fxml.FXML
    private Label printfullnameLabel;
    //Print full name label

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void printfullnameOnAction(ActionEvent actionEvent) {
        //take action to print full name button
        String first_name = firstnameTextfield.getText();
        String middle_name = middlenameTextfield.getText();
        String last_name = lastnameTextfield.getText();
        printfullnameLabel.setText("Your full name: " + first_name + " " + middle_name + " " + last_name + ".");
    }
}