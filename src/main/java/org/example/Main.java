package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.awt.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Haz clic aquí"); //Crear el botón
        button1.setOnAction(event -> System.out.println("Has pulsado el botón")); //Evento que debe ocurrir al pulsar el botón
        HBox hbox = new HBox(button1); //Colocar el botón
        hbox.setSpacing(10);
        Scene scene = new Scene(hbox, 300, 250); //ventana y que elementos tiene

        primaryStage.setTitle("Aplicación hacer click en el botón"); //nombre de la ventana
        primaryStage.setScene(scene); //ejecutar la escena
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}