package application.javafx2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerts;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btnSum;

    @FXML
    protected void onBtSumAction() {
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sum = number1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        }catch (NumberFormatException e){
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gui.util.Constraints.setTextFieldDouble(txtNumber1);
        gui.util.Constraints.setTextFieldDouble(txtNumber2);
        gui.util.Constraints.setTextFieldMaxLength(txtNumber1, 12);
        gui.util.Constraints.setTextFieldMaxLength(txtNumber2, 12);

    }
}