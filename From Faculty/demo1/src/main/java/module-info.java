module com.oop.sectionsix.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.sectionsix.demo1 to javafx.fxml;
    exports com.oop.sectionsix.demo1;
}