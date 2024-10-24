package com.example.loginwithfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        // Set the window title
        primaryStage.setTitle("Login Screen");

        // Create a scene with the FXML layout
        primaryStage.setScene(new Scene(root, 300, 200));

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}