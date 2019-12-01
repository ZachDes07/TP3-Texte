/**
 * Zachary Desroches
 * Remise le 06 décembre 2019
 * L’application permet de mettre en forme un TextArea, d’analyser son texte afin d’en extraire les entiers et
 * les mots, d’effectuer des tris et des recherches de caractères
 */
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
