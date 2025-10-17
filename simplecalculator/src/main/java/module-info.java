module com.oop.first.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.simplecalculator to javafx.fxml;
    exports com.oop.first.simplecalculator;
}