module at.garcia {
    requires javafx.controls;
    requires javafx.fxml;

    opens at.garcia to javafx.fxml;
    exports at.garcia;
}