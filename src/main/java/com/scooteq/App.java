package com.scooteq;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Das Herz des Programmes
 * Hier startet und endet das Programm
 * Erklärungen für Wörter/Objekte/Klassen -> https://trello.com/c/35LSKAZr
 */
public class App extends Application {

    public static void main(String[] args) {
        // Ruft automatisch die start()-Methode auf
        launch(args); 
    }


    // Damit das Programm startet, wird diese Methode vorausgesetzt!
    @Override
    public void start(Stage stage) throws Exception {

        // Sollte immer am Ende der Startmethode sein,
        // damit das Fenster auch "gerendert" wird.
        stage.show(); 
    }
}