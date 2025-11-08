package com.oop.sectionone.studentmanagementsystem;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.management.Notification;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class
StudentAddController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> genderTablecolumn;
    @javafx.fxml.FXML
    private TextArea summaryResultTextarea;
    @javafx.fxml.FXML
    private TextField cgpaTextfield;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TableColumn<Student, String> majorTablecolumn;
    @javafx.fxml.FXML
    private CheckBox pythonCheckbox;
    @javafx.fxml.FXML
    private TableView<Student> studentInfoTableview;
    @javafx.fxml.FXML
    private TableColumn<Student, String> nameTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> skillsTablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> majorCombobox;
    @javafx.fxml.FXML
    private TextField nameTextfield;
    @javafx.fxml.FXML
    private TableColumn<Student, String> idTablecolumn;
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private TableColumn<Student, String> cgpaTablecolumn;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private CheckBox javaCheckbox;
    @javafx.fxml.FXML
    private DatePicker dobDatepicker;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private TextField minimumCGPAFilterTextfield;
    @javafx.fxml.FXML
    private TableColumn<Student, String> hasScholarshipTablecolumn;
    @javafx.fxml.FXML
    private CheckBox hasScholarshipCheckbox;
    @javafx.fxml.FXML
    private CheckBox hasScholarshipFilterCheckbox;

    ArrayList<Student> studentList;
    @javafx.fxml.FXML
    public void initialize() {
        ToggleGroup tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);

        majorCombobox.getItems().addAll("CSE", "EEE", "BBA");

        dobDatepicker.setValue(LocalDate.of(2000,1,1));

        studentList = new ArrayList<>();

        idTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("id"));
        nameTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        cgpaTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("cgpa"));
        genderTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("gender"));
        skillsTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("skills"));
        majorTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("major"));
        hasScholarshipTablecolumn.setCellValueFactory(new PropertyValueFactory<Student,String>("hasScholarship"));

        Student s1 = new Student(111, "Nafis", "Male","Python", "CSE", 3.56f, LocalDate.of(2000, 1, 1), true);
        Student s2 = new Student(112, "Nafisa", "Female","Java", "CSE", 3.7f, LocalDate.of(2002, 1, 1), false);

        System.out.println(s2.getAge());
        studentList.add(s1);
        studentList.add(s2);
        studentInfoTableview.getItems().addAll(studentList);

        Random r = new Random();
        String generated_id = String.format("%07d", r.nextInt(10000000));
        idTextfield.setText(generated_id);
        idTextfield.setEditable(false);
    }

    @javafx.fxml.FXML
    public void showFemaleStudentButtonOnAction(ActionEvent actionEvent) {
        studentInfoTableview.getItems().clear();
        for(Student s: studentList){
            if(s.getGender().equals("Female")) studentInfoTableview.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void clearAllButtonOnAction(ActionEvent actionEvent) {
        studentInfoTableview.getItems().clear();
    }

    @javafx.fxml.FXML
    public void showMaleStudentButtonOnAction(ActionEvent actionEvent) {
        studentInfoTableview.getItems().clear();
        for(Student s: studentList){
            if(s.getGender().equals("Male")) studentInfoTableview.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void showSeniorStudentButtonOnAction(ActionEvent actionEvent) {
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        for(Student s: studentList){
            ageList.add(s.getAge());
        }
        int maxAge = Collections.max(ageList);

        Student seniorStudent = null;
        for(Student s: studentList){
            if(s.getAge()==maxAge) seniorStudent = s;
        }
        summaryResultTextarea.setText(seniorStudent.toString("abcd"));

    }

    @javafx.fxml.FXML
    public void scholarshipAndCgpaApplyFilterOnAction(ActionEvent actionEvent) {
        studentInfoTableview.getItems().clear();
        for(Student s: studentList){
            if(s.isHasScholarship()==hasScholarshipFilterCheckbox.isSelected() &&
            s.getCgpa()>=Float.parseFloat(minimumCGPAFilterTextfield.getText())) studentInfoTableview.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void addStudentButtonOnAction(ActionEvent actionEvent) {
        boolean digitFound = false;
        for(int i=0;i<nameTextfield.getText().length();i++){
            if(nameTextfield.getText().charAt(i)>='0'&& nameTextfield.getText().charAt(i)<='9') digitFound = true;
        }
        if(
                idTextfield.getText().isEmpty()||
                nameTextfield.getText().isEmpty()||
                cgpaTextfield.getText().isEmpty() ||
                dobDatepicker.getValue().isAfter(LocalDate.now())||
                digitFound
        ) {
            notificationLabel.setText("Fill up the form properly");
            Alert e1 = new Alert(Alert.AlertType.ERROR);
            e1.setTitle("Validation Failed!");
            e1.setContentText("Fill up the form properly");
            e1.show();
        }
        else{
            boolean sameIdFound = false;
            for(Student s: studentList){
                if(Integer.parseInt(idTextfield.getText())==s.getId()){
                    sameIdFound = true;
                }
            }
            if(sameIdFound) notificationLabel.setText("Same ID Found. Fix it.");
            else{
                String gender="";
                if(maleRadioButton.isSelected()) gender = "Male";
                else if(femaleRadioButton.isSelected()) gender = "Female";

                String skills="";
                if(javaCheckbox.isSelected() && pythonCheckbox.isSelected()) skills = "Java, Python";
                else if(javaCheckbox.isSelected()) skills = "Java";
                else if(pythonCheckbox.isSelected()) skills = "Python";

                Student s = new Student(
                        Integer.parseInt(idTextfield.getText()),
                        nameTextfield.getText(),
                        gender,
                        skills,
                        majorCombobox.getValue(),
                        Float.parseFloat(cgpaTextfield.getText()),
                        dobDatepicker.getValue(),
                        hasScholarshipCheckbox.isSelected()
                );



                notificationLabel.setText("Student added successfully");
                Alert e1 = new Alert(Alert.AlertType.CONFIRMATION);
                e1.setTitle("Confirmation Needed!");
                e1.setContentText("Are you sure?");
                e1.showAndWait().ifPresent(response->{
                    if(response==ButtonType.OK){
                        studentList.add(s);
                        studentInfoTableview.getItems().add(s);
                        reset();
                        Random r = new Random();
                        String generated_id = String.format("%07d", r.nextInt(10000000));
                        idTextfield.setText(generated_id);
                    }
                });
//                Alert e1 = new Alert(Alert.AlertType.INFORMATION);
//                e1.setTitle("Success!");
//                e1.setContentText("Student added successfully");
//                e1.show();
//                reset();
            }
        }
    }

    void reset(){
        nameTextfield.clear();
        cgpaTextfield.clear();
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        javaCheckbox.setSelected(false);
        pythonCheckbox.setSelected(false);
        dobDatepicker.setValue(LocalDate.of(2000, 1, 1));
        hasScholarshipCheckbox.setSelected(false);
        majorCombobox.setValue("");
    }

    @javafx.fxml.FXML
    public void showAllButtonOnAction(ActionEvent actionEvent) {
        studentInfoTableview.getItems().clear();
        for(Student s: studentList){
            studentInfoTableview.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void showAverageCGPAButtonOnAction(ActionEvent actionEvent) {
        float cgpaSum = 0;
        for(Student s: studentList){
            cgpaSum = cgpaSum + s.getCgpa();
        }
        float averageCgpa = cgpaSum/studentList.size();
        summaryResultTextarea.setText("Average cgpa is: "+ averageCgpa);
    }
}