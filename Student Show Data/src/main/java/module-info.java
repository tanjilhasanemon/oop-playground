module com.example.student_show_data {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.student_show_data to javafx.fxml;
    exports com.example.student_show_data;
}