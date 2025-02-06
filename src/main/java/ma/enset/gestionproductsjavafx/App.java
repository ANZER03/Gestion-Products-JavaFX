package ma.enset.gestionproductsjavafx;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = FXMLLoader.load(getClass().getResource("products-view.fxml"));
        root.getStylesheets().add(getClass().getResource("style.css").toString());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Gestion Products");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
