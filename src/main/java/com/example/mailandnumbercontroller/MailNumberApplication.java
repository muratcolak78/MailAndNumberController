package com.example.mailandnumbercontroller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MailNumberApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MailNumberApplication.class.getResource("controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 500);
        stage.setTitle("Mail and Number controller! Made by Colak");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}