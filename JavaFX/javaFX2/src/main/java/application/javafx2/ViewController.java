package application.javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button btnTest;

    @FXML
    protected void onBtnTestAction() {
        System.out.println("Click");
    }
}