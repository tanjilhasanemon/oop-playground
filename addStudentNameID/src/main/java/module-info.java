module com.oop.first.addstudentnameid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.addstudentnameid to javafx.fxml;
    exports com.oop.first.addstudentnameid;
}