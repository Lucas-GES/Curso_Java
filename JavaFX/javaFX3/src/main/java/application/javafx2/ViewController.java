package application.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import util.Alerts;

public class ViewController {
    @FXML
    private Button btnTest;

    @FXML
    protected void onBtnTestAction() {
        Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.ERROR);
    }
}