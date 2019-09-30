package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Sala
 */
public class Sala {

    public List<Fila> filas = new ArrayList<>();
    public List<Pelicula> peliculas = new ArrayList<Pelicula>();

    public void agregarFila() {

        Fila fila = new Fila(1);
        filas.add(fila);
    }

    public void agregarPeliculas() {
        Pelicula pelicula = new Pelicula("Inglourious Basterds");
        pelicula.nombreDirector = "Quentin Tarantino";
        pelicula.edadMinima = 18;
        pelicula.duracion = 153;
        peliculas.add(pelicula);

        pelicula = new Pelicula("Kubo and the Two Strings");
        pelicula.nombreDirector = ("Travis Knight");
        pelicula.edadMinima = 8;
        pelicula.duracion = 102;
        peliculas.add(pelicula);
    }

    public Pelicula traerPelicula(String n) {

        for (Pelicula r : peliculas) {
            if (n.equals(r.titulo)) {
                return r;
            }

        }
        return null;
    }

    public void mostrarPeliculas() {
        for (Pelicula r : this.peliculas) {
            System.out.println(r.titulo + " Clasificion: +" + r.edadMinima + "\n");

        }
    }

}