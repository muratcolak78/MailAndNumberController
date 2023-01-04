package com.example.mailandnumbercontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

import java.lang.reflect.Field;

public class MailNumberController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label warningText;
    @FXML
    private Label warmingLabel;

    @FXML
    private IsThisMailAdress isThisMailAdress;
    @FXML

    private IsThisPhoneNumber isThisPhoneNumber;
    @FXML
    private TextField numberField;
    @FXML
    private TextField emailField;

    @FXML
    public void onControlClick() {
        isThisMailAdress = new IsThisMailAdress();
        String text = emailField.getText();
        if (text.equals("")) {
            warningText.setText("Lütfen bir adres giriniz.");
            onClearClick2();
        } else if (isThisMailAdress.lastTest(emailField.getText())) {
            warningText.setText(text + "\nBu bir mail adresidir");
            warningText.setStyle("-fx-text:bold;-fx-text-fill: green; -fx-font-size: 16px;");

            emailField.setText("");
            onClearClick2();

        } else {

            text = text + "\nBu bir mail adresi değildir";
            warningText.setText(text);
            warningText.setStyle("-fx-text:bold;-fx-text-fill: red;-fx-text:bold; -fx-font-size: 16px;");
            emailField.setText("");
            onClearClick2();
        }

    }

    @FXML
    public void onClearClick() {
        warningText.setText("");
        emailField.setText("");
        isThisMailAdress = new IsThisMailAdress();
    }

    @FXML
    public void onClearClick2() {
        emailField.setText("");
        isThisMailAdress = new IsThisMailAdress();
    }


    @FXML
    public void onControlNumberClick() {
        isThisPhoneNumber = new IsThisPhoneNumber();
        String text = numberField.getText();
        if (text.equals("")) {
            warmingLabel.setText("Lütfen bir numara giriniz.");

            onNumberFieldClearClick2();
        } else if (isThisPhoneNumber.generalTest(numberField.getText())) {
            warmingLabel.setText(text + "\nBu bir telefon numarasıdır");
            warmingLabel.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
            numberField.setText("");
            onNumberFieldClearClick2();

        } else {
            warmingLabel.setText(text + "\nBu bir telefon numarası değildir");
            warmingLabel.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
            numberField.setText("");
            onNumberFieldClearClick2();
        }


    }

    @FXML
    public void onNumberFieldClearClick() {

        warmingLabel.setText("");
        numberField.setText("");
        isThisPhoneNumber = new IsThisPhoneNumber();
    }

    @FXML
    public void onNumberFieldClearClick2() {


        numberField.setText("");
        isThisPhoneNumber = new IsThisPhoneNumber();
    }

}