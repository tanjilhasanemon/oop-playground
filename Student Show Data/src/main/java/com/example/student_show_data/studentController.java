package com.example.student_show_data;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class studentController
{
    @FXML
    private TextField idTextField;
    @FXML
    private RadioButton otherRadioButton;
    @FXML
    private CheckBox scholarshipyesCheckBox;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private CheckBox scholarshipnoCheckBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private ToggleGroup genderradiobuttons;
    @FXML
    private ComboBox<String> majorCombobox;
    @FXML
    private Label outputLabel;

    @FXML
    public void initialize() {
        majorCombobox.getItems().addAll("CSE", "EEE", "BBA", "ELT", "Sociology");
    }

    @Deprecated
    public void outputLabel(ActionEvent actionEvent) {
    }

    @FXML
    public void showstudentinfoOnAction(ActionEvent actionEvent) {
        //id

        int id = Integer.parseInt(idTextField.getText());
        if (idTextField.getText().isEmpty()){
            outputLabel.setText("Provide your id");
            return;
        }

        //name
        String name = nameTextField.getText();
        if (nameTextField.getText().isEmpty()){
            outputLabel.setText("provide your name.");
        }

        //major

        String major = majorCombobox.getValue();

        //gender

        String gender = "";
        if (maleRadioButton.isSelected()){
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }else if (otherRadioButton.isSelected()){
            gender ="Others";
        }else outputLabel.setText("select your gender");


        // scholarship
        boolean scholarship = false;
        if (scholarshipyesCheckBox.isSelected()){
            scholarship = true;
        } else if (scholarshipnoCheckBox.isSelected()) {
            scholarship = false;

        }else outputLabel.setText("select the checkbox for your scholarship");


        student st = new student(id, scholarship, gender, name, major);
        outputLabel.setText(st.toString());

    }
}