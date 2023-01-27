
package lab2p2_danielreyes;

import java.awt.Color;


public class Casas {
    private int numcasa;
    private int numbloque;
    private Color color;
    private int ancho;
    private int largo;
    private int numbano;
    private int numcuarto;

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getNumbano() {
        return numbano;
    }

    public void setNumbano(int numbano) {
        this.numbano = numbano;
    }

    public int getNumcuarto() {
        return numcuarto;
    }

    public void setNumcuarto(int numcuarto) {
        this.numcuarto = numcuarto;
    }

    @Override
    public String toString() {
        return "Casas{" + "numcasa=" + numcasa + ", numbloque=" + numbloque + ", color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", numbano=" + numbano + ", numcuarto=" + numcuarto + '}';
    }
    
   
    
}
