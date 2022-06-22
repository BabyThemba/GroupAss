module com.example.groupass {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.groupass to javafx.fxml;
    exports com.example.groupass;
}