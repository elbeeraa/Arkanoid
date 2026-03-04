package es.masanz.ut6.arkanoid.model;

import javafx.scene.PointLight;
import javafx.scene.canvas.GraphicsContext;

import static es.masanz.ut6.arkanoid.conf.Const.*;

public class Ladrillo extends Sprite {

    public int vidas;

    public Ladrillo(double x, double y) {
        super(x * TAM_CASILLA, y * TAM_CASILLA, 1, 2 * TAM_CASILLA, TAM_CASILLA, 0.0, 0.0);
        this.vidas = 1;
    }

    @Override
    public boolean mover(Nivel nivel) {
        return true;
    }

    @Override
    public void pintar(GraphicsContext gc) {
        gc.setFill(COLORES[vidas]);
        gc.fillRect(x, y, anchura, altura);
        // por ponerle un color al borde...
        gc.setStroke(COLORES[4]);
        gc.strokeRect(x, y, anchura, altura);
    }

    public boolean morir(){
        vidas--;
        if(vidas <= 0){
            return true;
        }
        return false;
    }

    public Potenciador obtenerPotenciador() {
        // TODO 05: ‼️ Devolver un potenciador u otro con la probabilidad que se desee
        double numeroAleatorio = Math.random();
        int numeroPotenciador = (int) (Math.random() * 3 + 1);
        if(numeroAleatorio > 0.6){
            switch (numeroPotenciador){
                case 1:
                   // return new PotAnchura()
            }
        }
        //TODO ⚠️ PREGUNTAR -> si creo nuevo potenciador me pide x e y (si es asi tendria que meterle la x e y del ladrillo que muere no?)⚠️
        //
        return null;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
