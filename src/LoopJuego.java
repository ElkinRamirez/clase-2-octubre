
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

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
    private Image fondo;
    private Image gato;
    private Image humano;
    private int variable;
    private int variable2;
    private int puntaje;

    

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.fondo=new Image("imagen/fondo.png");
        this.gato=new Image("imagen/cats.gif");
        this.humano=new Image("imagen/left2.png");
        this.carro=new Carro(0, 100, 20, 20);
        this.carro.mover();
        this.variable=0;
        this.variable2=0;
        this.puntaje=0;
    }
    
    
    @Override
    public void handle(long l) {
       lapiz.clearRect(0, 0, 1025, 515);
       lapiz.drawImage(this.fondo, variable2, 0);
       lapiz.drawImage(gato, 132*(this.variable/5), 0, 132, 80, 0, 350,132, 80);
       lapiz.strokeRect(0, 350, 135, 90);
       lapiz.strokeRect(variable2+324,396-30,50,50);
       lapiz.drawImage(humano, variable2+330, 396+4-25);
       
       variable++;
       variable2--;
       lapiz.strokeText( "Puntaje:"+puntaje, 150, 10);
       if (variable2==-512){
           variable2=0;
       }
       if  (variable>25){
           variable=0;
       Shape rectangulo1=new Rectangle(0, 350, 135, 90);
       Shape rectangulo2=new Rectangle(variable2+324,396-30,50,50);
       Shape interseccion= SVGPath.intersect(rectangulo1,rectangulo2);
       
       if(interseccion.getBoundsInLocal().getWidth()>=0){
           
           puntaje=puntaje-10;
           
       }else{
           puntaje=puntaje;
       }
       
       
       }
       
       
    //Carro
//       lapiz.strokeRect(this.carro.getXref(),this.carro.getYref(),this.carro.getAncho(),this.carro.getAlto());
//       
//       lapiz.strokeText( "Puntaje: 100", 150, 10);
//       this.carro.mover();
       
    }
    
}
