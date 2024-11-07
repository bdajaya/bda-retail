package com.bdajaya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat label dengan teks "Hello, JavaFX!"
        Label label = new Label("Hello, JavaFX!");

        // Membuat layout StackPane dan menambahkan label ke dalamnya
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Membuat scene dan menambahkan layout ke dalam scene
        Scene scene = new Scene(root, 300, 200);

        // Menyeting judul aplikasi
        primaryStage.setTitle("Hello JavaFX Example");

        // Menyeting scene utama dari stage
        primaryStage.setScene(scene);

        // Menampilkan stage ke layar
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
