import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesEEventos extends Application {
    @Override
    public void start(Stage stage) {
        // componentes
        Label titulo = new Label("Bem-vindo ao JavaFX!");
        TextField campoTexto = new TextField();
        Button botao = new Button("Clique aqui");

        // ação do botão
        botao.setOnAction(e -> {
            String texto = campoTexto.getText();
            if ("".equals(texto)) {
                titulo.setText("Digite seu nome!!");
            } else {
                titulo.setText("Olá, " + texto);
            }
        });

        // layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulo, campoTexto, botao);

        // cena e palco
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Tela Simples JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}