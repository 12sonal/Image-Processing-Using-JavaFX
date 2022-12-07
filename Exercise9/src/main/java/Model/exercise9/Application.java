package Model.exercise9;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Application {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}