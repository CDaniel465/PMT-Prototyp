package de.hhn.se.pmt.ai.buga23.view.registerbuga23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Regristrieren_Pannel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 476.0, 515.0);
        stage.setTitle("Registrieren");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}