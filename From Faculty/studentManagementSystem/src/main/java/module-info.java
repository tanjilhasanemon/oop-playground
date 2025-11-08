module com.oop.sectionone.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.management;


    opens com.oop.sectionone.studentmanagementsystem to javafx.fxml;
    exports com.oop.sectionone.studentmanagementsystem;
}