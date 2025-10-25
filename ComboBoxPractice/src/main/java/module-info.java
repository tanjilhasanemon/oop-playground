module com.oop.first.comboboxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.comboboxpractice to javafx.fxml;
    exports com.oop.first.comboboxpractice;
}