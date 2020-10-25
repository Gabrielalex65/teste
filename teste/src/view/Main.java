package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();

        Scene scn = new Scene(bp, 400, 200);

        Button btn = new Button("Sair");

        Label lbl = new Label("Olá");

        Manipulador man = new Manipulador(lbl);

        btn.addEventFilter(ActionEvent.ANY, man);
        
        bp.setBottom(btn);

        bp.setTop(lbl);

        stage.setScene(scn);

        stage.setTitle("Teste de Eventos");

        stage.show();

    }

}

class Manipulador implements EventHandler<ActionEvent> {
    private Label lbl;
    public Manipulador(Label lbl) {
        this.lbl = lbl;
    }

    @Override
    public void handle(ActionEvent arg0) {
        System.exit(0);

    }

}
