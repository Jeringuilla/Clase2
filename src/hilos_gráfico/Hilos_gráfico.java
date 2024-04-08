
package hilos_gráfico;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hilos_gráfico extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pantalla objeto_pantalla = new Pantalla();
        objeto_pantalla.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
