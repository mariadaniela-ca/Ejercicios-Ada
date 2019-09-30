package app;

/**
 * Pelicula
 */
public class Pelicula {

    public String titulo;

    public String nombreDirector;

    public int duracion;

    public int edadMinima;

    public Pelicula(){

    }

    public Pelicula(String nombre){
        this.titulo = nombre;
    }


    public String getTituloPelicula(){
        return titulo;
    }

    public String getNombreDirector(){
        return nombreDirector;
    }

    public int getDuracion(){
        return duracion;
    }

    public void comprobarEdad(int n) {
        if(n < this.edadMinima){
            System.out.println("La persona no tiene la edad minima requerida para ver la pelicula");
        }
        else {
            System.out.println("La persona tiene la edad para ver la pelicula");
        }
    }

}