module com.oop.sectionone.testingscope {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.sectionone.testingscope to javafx.fxml;
    exports com.oop.sectionone.testingscope;
}