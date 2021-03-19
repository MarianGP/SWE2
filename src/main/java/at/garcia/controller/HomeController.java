package at.garcia.controller;

import at.garcia.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable  {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("search");
    }

    @FXML
    private void switchToToursView() throws IOException {
        App.setRoot("tours");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
