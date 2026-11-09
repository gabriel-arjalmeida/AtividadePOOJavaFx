package main.Click;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClick extends Application {
    private int valor = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Label texto = new Label("Contador de cliques");
        Label textoApoio = new Label("Quantidade de cliques: ");
        Label label = new Label("0");
        Button button = new Button("Clique aqui");
        button.setOnAction(event -> {valor++; label.setText(String.valueOf(valor));});
        VBox root = new VBox(20,texto,button,textoApoio, label);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
