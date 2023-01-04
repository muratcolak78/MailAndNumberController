module com.example.mailandnumbercontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mailandnumbercontroller to javafx.fxml;
    exports com.example.mailandnumbercontroller;
}