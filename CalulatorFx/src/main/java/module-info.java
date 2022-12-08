module com.example.calulatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calulatorfx to javafx.fxml;
    exports com.example.calulatorfx;
}