module com.oop.first.printname {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.printname to javafx.fxml;
    exports com.oop.first.printname;
}