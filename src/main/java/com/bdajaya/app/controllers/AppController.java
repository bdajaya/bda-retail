package com.bdajaya.app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {

    @FXML
    private Label greetingLabel;

    @FXML
    public void initialize() {
        greetingLabel.setText("Selamat Datang di BigSystemMenuIcons ListViewMultiselectPerformance!");
    }
}
