package com.oop.first.addstudentnameid;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class studentController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField cgpaTextfield;
    @javafx.fxml.FXML
    private TextField majorTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ArrayList<Student> studentlist = new ArrayList<>();
    ArrayList<Student> filterstudentlist = new ArrayList<>();

    @javafx.fxml.FXML
    public void addstudentButtonOnAction(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        int id = Integer.parseInt(idTextField.getText());
        float cgpa = Float.parseFloat(cgpaTextfield.getText());
        String major = majorTextField.getText();


        Student newstudent = new Student(id, cgpa, name ,major);
        studentlist.add(newstudent);

        idTextField.clear();
        nameTextField.clear();
        cgpaTextfield.clear();
        majorTextField.clear();
    }

    @javafx.fxml.FXML
    public void viewallstudentButtonOnAction(ActionEvent actionEvent) {
        for(Student t: studentlist){
            System.out.println("Name: " + t.getName());
            System.out.println("Id: " + t.getId());
            System.out.println("CGPA: " + t.getCgpa());
            System.out.println("Major: " + t.getMajor());
        }
    }

    @javafx.fxml.FXML
    public void showonlycsestudentButtonOnAction(ActionEvent actionEvent) {
        for(Student s: studentlist) {
            if (Objects.equals(s.getMajor(), "CSE")) {
                filterstudentlist.add(s);
            }
        }
        for(Student s: filterstudentlist){
            System.out.println("Name: " + s.getName());
            System.out.println("Id: " + s.getId());
            System.out.println("CGPA: " + s.getCgpa());
            System.out.println("Major: " + s.getMajor());

        }
    }
}