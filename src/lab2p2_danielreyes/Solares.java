package lab2p2_danielreyes;

/**
 *
 * @author alema
 */
public class Solares {

    private int ancho;
    private int largo;
    private int area;

    public Solares() {

    }

    public Solares(int ancho, int largo, int area) {
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Solares{" + "ancho=" + ancho + ", largo=" + largo + ", area=" + ancho*largo + '}';
    }

}
