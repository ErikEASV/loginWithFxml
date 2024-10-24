package com.example.loginwithfxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    // Hardcoded username and password for simplicity
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    @FXML
    private void handleLogin() {
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();

        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            statusLabel.setText("Login successful!");
            statusLabel.setStyle("-fx-text-fill: green;");
        } else {
            statusLabel.setText("Login failed. Please try again.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }
}
