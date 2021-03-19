package at.garcia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("home"), 840, 680);
        scene.getStylesheets().add(App.class.getResource("style/style.css").toString());
        stage.setTitle("Tour Planner");
        stage.setScene(scene);
        stage.setMinWidth(300);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
//        String viewCss = App.class.getResource("style/"+ fxml +".css").toString();
//        String mainCss = App.class.getResource("style/style.css").toString();
//        scene.getStylesheets().addAll(viewCss, mainCss);
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
