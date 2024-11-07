package com.bdajaya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BigSystemMenuIcons extends Application {
    public static void main(String[] args) {
        Application.launch(BigSystemMenuIcons.class);
    }

    public void start(Stage primaryStage) throws Exception {
        MenuItem menuItem1 = new MenuItem("save");
        menuItem1.setGraphic(new ImageView("/icons/1-red.png"));

        MenuItem menuItem2 = new MenuItem("Loads");
        menuItem2.setGraphic(new ImageView("/icons/2-green.png"));

        Menu iconsMenu = new Menu("Icons");
        iconsMenu.getItems().addAll(menuItem1, menuItem2);

        MenuBar menuBar = new MenuBar();
        menuBar.setUseSystemMenuBar(true);
        menuBar.getMenus().add(iconsMenu);

        Scene scene = new Scene(menuBar);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}