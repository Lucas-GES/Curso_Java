package application.javafx2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import model.entities.Person;
import util.Alerts;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;

    private ObservableList<Person> obsList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Maria", "maria@gmail.com"));
        list.add(new Person(2, "Alex", "alex@gmail.com"));
        list.add(new Person(3, "Bob", "bob@gmail.com"));

        obsList = FXCollections.observableArrayList(list);
        comboBoxPerson.setItems(obsList);
    }
}