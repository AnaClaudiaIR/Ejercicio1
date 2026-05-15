package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import java.awt.*;
//import java.awt.TextField; --> No se necesitan estos imports
import javafx.scene.control.*;

import java.util.Optional;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Botón"); //Nombre ventana
        Label label = new Label("Botón ejemplo"); //Mensaje información
        Button boton = new Button("Haz clic aquí"); //Botón

        VBox vBox = new VBox(label,boton); //Caja donde meter los elementos

        Scene scene = new Scene(vBox,200,100); //Ventana
        primaryStage.setScene(scene); //Colocar la ventana en la escena
        primaryStage.show(); //Mostrar la escena
    }
    public static void main(String[] args) {
        launch(args);
    }
}
