package com.bdajaya.app;    //Mendefinisikan package tempat class MainApp berada.

//import statements: Menambahkan dependensi yang diperlukan dari JavaFX untuk membuat antarmuka grafis.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            // Path absolut ke file FXML
            File fxmlFile = new File("src/main/java/com/bdajaya/app/ui/fxml/MainApp.fxml");
            URL fxmlUrl = fxmlFile.toURI().toURL();

            // Muat FXML
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl);
            Parent root = fxmlLoader.load();

            // Tampilkan scene
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("BDAJAYA");
            primaryStage.show();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
