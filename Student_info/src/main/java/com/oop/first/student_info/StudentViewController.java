package com.oop.first.student_info;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class StudentViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn <Student , String> idTableColumn;
    @javafx.fxml.FXML
    private TextField cgpaTextField;
    @javafx.fxml.FXML
    private TableColumn <Student , String>nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Student , String>majorTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Student , String>genderTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextArea showaveragecgpaTextArea;
    @javafx.fxml.FXML
    private CheckBox pythonCheckBox;
    @javafx.fxml.FXML
    private ComboBox <String>majorComboBox;
    @javafx.fxml.FXML
    private TableColumn <Student , String>cgpaTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Student , String>dobTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Student , String>skillsTableColumn;
    @javafx.fxml.FXML
    private TableView <Student>studentinfoTableView;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private CheckBox javaCheckBox;
    @javafx.fxml.FXML
    private DatePicker dobDatepicker;
    @javafx.fxml.FXML
    private Label warningLabel;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private Button averagecgpaButton;


    ArrayList <Student> studentlist;


    ToggleGroup tg;


    @javafx.fxml.FXML
    public void addstudentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void averagecgpaButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showmalestudentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void initialize() {
    }
}