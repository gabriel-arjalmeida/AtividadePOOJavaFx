package main.Conversor;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainConversor extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label texto = new Label("Conversor de temperatura");
        TextField celcius = new TextField();
        celcius.setPromptText("Celcius(C°)");
        Button conversor = new Button("Converter");
        Label textoApoio = new Label("A temperatura em Fahrenheint: ");
        Label fahrenheint = new Label();


        conversor.setOnAction(event -> {double valor = Double.parseDouble(celcius.getText());
            fahrenheint.setText(String.valueOf((valor * 9 / 5) + 32));
        });

        VBox root = new VBox(20,texto,celcius,conversor,textoApoio,fahrenheint);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();

    }
}
