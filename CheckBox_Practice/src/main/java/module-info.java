module com.example.checkbox_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkbox_practice to javafx.fxml;
    exports com.example.checkbox_practice;
}