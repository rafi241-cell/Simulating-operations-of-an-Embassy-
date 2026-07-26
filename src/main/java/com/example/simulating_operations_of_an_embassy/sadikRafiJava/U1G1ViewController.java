package com.example.simulating_operations_of_an_embassy.sadikRafiJava;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import javafx.scene.control.TextField;

public class U1G1ViewController {
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField phoneNumberTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private ComboBox<String> visaCategoryCB;
    @javafx.fxml.FXML
    private TextField nationalityTF;
    @javafx.fxml.FXML
    private TextField passportNumberTF;

    @javafx.fxml.FXML
    public void initialize(){
        visaCategoryCB.getItems().addAll("Tourist","Student","Business", "Transit", "Medical");
    }
    @javafx.fxml.FXML
    public void addApplicantButtonOnAction(ActionEvent actionEvent) {
    }
}
