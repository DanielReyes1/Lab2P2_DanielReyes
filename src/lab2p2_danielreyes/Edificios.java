
package lab2p2_danielreyes;


public class Edificios {
    
    private int numpisos;
    private int locales;
    private String direccion;
    
    public Edificios(){
        
    }
    public Edificios(int numpisos, int locales, String direccion){
        this.direccion= direccion;
        this.locales= locales;
        this.numpisos= numpisos;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Edificios{" + "numpisos=" + numpisos + ", locales=" + locales + ", direccion=" + direccion + '}';
    }
    
    
}
