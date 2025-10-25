module com.example.radiobutton_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.radiobutton_practice to javafx.fxml;
    exports com.example.radiobutton_practice;
}