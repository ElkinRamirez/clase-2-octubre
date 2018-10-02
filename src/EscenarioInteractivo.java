/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class EscenarioInteractivo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane layout=new Pane();
        Canvas canvas=new Canvas(300,300);
        layout.getChildren().add(canvas);
        Scene escena =new Scene(layout,300,300,Color.WHITESMOKE);
        
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        LoopJuego juego=new LoopJuego(lapiz);
        juego.start();
        //Texto
        lapiz.strokeText( "Puntaje: 100", 150, 10);
        //Carro
        lapiz.strokeRect(40,60 ,50 ,20);
        lapiz.fillOval(45, 80, 10, 10);
        lapiz.fillOval(75, 80, 10, 10);
        //Piso
        lapiz.fillRect(0, 90, 500, 500);
        //Semaforo
        lapiz.fillRect(150, 70, 9,45);
        lapiz.fillRect(145,25,20,45);
        lapiz.setFill(Color.GREEN);
        lapiz.fillOval(149,26,14, 14);
        lapiz.setFill(Color.YELLOW);
        lapiz.fillOval(149,40,14, 14);
        lapiz.setFill(Color.RED);
        lapiz.fillOval(149,54,14,14);
        
        
        primaryStage.setScene(escena);
        primaryStage.setTitle("Ejemplo escenario interactivo.");
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
