package at.garcia.controller;

import at.garcia.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ToursController implements Initializable  {

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToAddLog() throws IOException {
        App.setRoot("log");
    }

    @FXML
    private void switchToAddTour() throws IOException {
        App.setRoot("addLog");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
