package app;

/**
 * Espectador
 */
public class Espectador {

    public String nombre;

    public int edad;

    public int dinero;

    public Espectador(String nombre){
        this.nombre = nombre;
    }

    public int getDinero(){
        return dinero;
    }

    public int getEdad(){
        return edad;
    }


}