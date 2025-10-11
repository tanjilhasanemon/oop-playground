module com.oop.first.codewgaes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.codewgaes to javafx.fxml;
    exports com.oop.first.codewgaes;
}