module com.example.testjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.testjava to javafx.fxml;
    exports com.example.testjava;
}