module com.imagefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;


    opens com.imagefx.controller to javafx.fxml;
    exports com.imagefx.controller;
    opens com.imagefx.view to javafx.fxml;
    exports com.imagefx.view;
}