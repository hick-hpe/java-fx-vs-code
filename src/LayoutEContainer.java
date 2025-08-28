import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutEContainer extends Application {
    @Override
    public void start(Stage stage) {
        // VBox: contêineres para organizar elementos.
        // 10 pixels de espaçamento entre os elementos
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20)); // distância das bordas
        
        // componentes
        Label label = new Label("Nome:");
        TextField txt = new TextField();

        // adicionar no VBox
        vbox.getChildren().addAll(label, txt);

        // cena para exibir
        Scene scene = new Scene(vbox, 300, 200);

        // define qual tela (scene) será exibida na janela principal (stage)
        stage.setScene(scene);

        // exibe a janela na tela do usuário
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
