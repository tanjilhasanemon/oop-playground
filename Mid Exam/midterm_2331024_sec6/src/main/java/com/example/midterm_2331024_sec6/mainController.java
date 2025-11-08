package com.example.midterm_2331024_sec6;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;

public class mainController
{
    @FXML
    private TableColumn<PetMonitor, String> lastchekupTableColumn;
    @FXML
    private TableView < String>petTableView;
    @FXML
    private DatePicker lastchekupDatePicker;
    @FXML
    private TableColumn<PetMonitor, String> petidTableColumn;
    @FXML
    private TableColumn<PetMonitor, String> pettempTableColumn;
    @FXML
    private DatePicker filterDatePicker;
    @FXML
    private TextArea notificationTextArea;
    @FXML
    private ComboBox  < String>pettypeComboBox;
    @FXML
    private TextField petidTextField;
    @FXML
    private TableColumn<PetMonitor, String> pettypeTableColumn;
    @FXML
    private ComboBox < String> filterComboBox;
    @FXML
    private TextField tempincelsiusTextField;
    @FXML
    private Label highesttempshowLabel;
    @FXML
    private CheckBox vaccinatedCheckBox;
    @FXML
    private TableColumn<PetMonitor, String> vaccinatedTableColumn;

    @FXML
    public void initialize() {
        lastchekupDatePicker.setValue(LocalDate.of(2022,1,1));
        pettypeComboBox.getItems().addAll("Dog", "cat", "bird");
        filterComboBox.getItems().addAll("Dog", "cat", "bird");
        filterDatePicker.setValue(LocalDate.of(2022, 1,1));
        //String petId, String petType, float petTempCels,
        // LocalDate lastChekupDate, boolean vaccinated

        petidTableColumn.setCellValueFactory(new PropertyValueFactory<>("petId"));
        pettypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("petType"));
        pettempTableColumn.setCellValueFactory(new PropertyValueFactory<>("petTempCels"));
        lastchekupTableColumn.setCellValueFactory(new PropertyValueFactory<>("lastChekupDate"));
        vaccinatedTableColumn.setCellValueFactory(new PropertyValueFactory<>("vaccinated"));

    }

    ArrayList<PetMonitor> petmonitorlist = new ArrayList<>();

    @FXML
    public void highesttempOnAction(ActionEvent actionEvent) {
        ArrayList<PetMonitor> highesttemp = new ArrayList<>();
        float highestemp = petmonitorlist.getFirst().getPetTempCels();
        for (int i = 0; i < petmonitorlist.toArray().length ; i++) {
            if (petmonitorlist.getFirst().getPetTempCels() >= highestemp){
                highestemp = petmonitorlist.getFirst().getPetTempCels();

            }



        }
    }

    @FXML
    public void filterOnAction(ActionEvent actionEvent) {

        String petId = petidTextField.getText();
        String petType = pettypeComboBox.getValue();
        float petTempCels = Float.parseFloat(tempincelsiusTextField.getText());
        LocalDate lastCheckupDate = lastchekupDatePicker.getValue();
        boolean vaccinated = vaccinatedCheckBox.isSelected();



        ArrayList<PetMonitor> filteredpetlist = new ArrayList<>();
        String fpettype = filterComboBox.getValue();
        LocalDate lastchekupdate = null;
        if (lastchekupdate.isAfter((ChronoLocalDate) lastchekupDatePicker)){
            return;
        }
        String fpetType = "";
        PetMonitor s = new PetMonitor(petId,fpetType,petTempCels,lastCheckupDate,vaccinated);
        filteredpetlist.add(s);
        petTableView.getItems().clear();
        petTableView.getItems().addAll(String.valueOf(filteredpetlist));









    }

    @FXML
    public void addnewpetOnAction(ActionEvent actionEvent) {


        String petId = petidTextField.getText();
        String petType = pettypeComboBox.getValue();
        float petTempCels = Float.parseFloat(tempincelsiusTextField.getText());
        LocalDate lastCheckupDate = lastchekupDatePicker.getValue();
        boolean vaccinated = vaccinatedCheckBox.isSelected();

        boolean petconsistD = false;
        for (int i = 0; i < petidTextField.getText().length(); i++) {
            if(i<= 9){
                petconsistD = true;
            }
        }
        if ((petconsistD) && petTempCels >= 30 || petTempCels <= 45.0){
            PetMonitor s = new PetMonitor(petId,petType,petTempCels,lastCheckupDate,vaccinated);
            petmonitorlist.add(s);
            petTableView.getItems().addAll(String.valueOf(s));
            notificationTextArea.setText("pet added");
        }



    }


}