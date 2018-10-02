
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro=new Carro(0, 100, 20, 20);
        this.carro.mover();
    }
    
    
    @Override
    public void handle(long l) {
        lapiz.clearRect(0, 0, 300, 300);
    //Carro
       lapiz.strokeRect(this.carro.getXref(),this.carro.getYref(),this.carro.getAncho(),this.carro.getAlto());
       
       lapiz.strokeText( "Puntaje: 100", 150, 10);
       this.carro.mover();
       
    }
    
}
