package at.garcia.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class SecondaryModel {

    private final StringProperty input = new SimpleStringProperty("Tour");
    private final StringProperty output = new SimpleStringProperty("Hello ");

    public StringProperty getInput() { // nameProperty ?
        return input;
    }

    public StringProperty getOutput() {
        return output;
    }

    public void setOutput() {
        this.output.set(this.input.get());
        this.input.set("");
    }

}
