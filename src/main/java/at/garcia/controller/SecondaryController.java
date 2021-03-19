package at.garcia.controller;

import at.garcia.model.SecondaryModel;
import at.garcia.App;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondaryController implements Initializable {

    public SecondaryModel model = new SecondaryModel();
    public TextField inputTextField;
    public Label outputLabel;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("home");
    }

    @FXML
    public void setName(ActionEvent actionEvent) {
        System.out.println(actionEvent);
        model.setOutput();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inputTextField.textProperty().bind(model.getInput());
        Bindings.bindBidirectional(outputLabel.textProperty(), model.getOutput());
    }
}
