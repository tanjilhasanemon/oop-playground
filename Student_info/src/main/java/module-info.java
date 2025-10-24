module com.oop.first.student_info {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.first.student_info to javafx.fxml;
    exports com.oop.first.student_info;
}