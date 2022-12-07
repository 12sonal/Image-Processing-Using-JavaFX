module com.example.exercise9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens Model.exercise9 to javafx.fxml;
    exports Model.exercise9;
}