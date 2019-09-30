package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Pooflix {

    public static List<Pelicula> CatalogoPeliculas = new ArrayList<Pelicula>();
    public static List<Serie> CatalogoSeries = new ArrayList<Serie>();

    public static Pelicula buscarPelicula(String nombre) {

        for (Pelicula p : Pooflix.CatalogoPeliculas) {
            if (nombre.equals(p.nombre)) {
                return p;

            }

        }
        return null;
    }

    public static Serie buscaSerie(String nombre){

        for (Serie se : Pooflix.CatalogoSeries) {
            if(nombre.equals(se.nombre)){
                return se;
            }
            
        }return null;

    }

    public static void limpiarCatalogo() {
        Pooflix.CatalogoPeliculas.clear();
        Pooflix.CatalogoSeries.clear();
    }

    public static void InicializarCatalogo() {
        Pooflix.agregarWestworld();

    }

  
    public static void agregarWestworld(){
        Serie ww = new Serie();
        ww.nombre = "Westworld";
        ww.genero = "Ciencia ficción";
        ww.anio = 2016;

        Temporada t1 = new Temporada();
        t1.nroTemporada = 1;
    
        Temporada tw = new Temporada();
        tw.nroTemporada = 2;

        Episodio epi = new Episodio("The Original");
        epi.duracion = 68;
        epi.nroEpisodio = 1;

        t1.episodios.add(epi);

        epi = new Episodio("Chestnut");
        epi.duracion = 59;
        epi.nroEpisodio = 2;

        t1.episodios.add(epi);

        epi = new Episodio("The Stray");
        epi.duracion = 59;
        epi.nroEpisodio = 3;

        t1.episodios.add(epi);

        epi = new Episodio("Dissonance Theory");
        epi.duracion = 59;
        epi.nroEpisodio = 4;

        t1.episodios.add(epi);

        epi = new Episodio("Contrapasso");
        epi.duracion = 57;
        epi.nroEpisodio = 5;
        t1.episodios.add(epi);

        epi = new Episodio("The Adversary");
        epi.duracion= 57;
        epi.nroEpisodio = 6;

        t1.episodios.add(epi);

        epi = new Episodio("Trompe L'Oleil");
        epi.duracion= 57;
        epi.nroEpisodio = 7;

        t1.episodios.add(epi);

        epi = new Episodio("Trace Decay");
        epi.duracion= 58;
        epi.nroEpisodio = 8;

        t1.episodios.add(epi);

        epi = new Episodio("The Well- Tempered Clavier");
        epi.duracion= 58;
        epi.nroEpisodio = 9;

        t1.episodios.add(epi);

        epi = new Episodio("The Bicameral mind");
        epi.duracion= 57;
        epi.nroEpisodio = 10;
        
        t1.episodios.add(epi);

        Websodio w1 = new Websodio("Websodio 1");
        w1.nroEpisodio = 1;
        w1.duracion = 5;

        tw.episodios.add(w1);

        Websodio w2 = new Websodio("Websodio 2");
        w2.nroEpisodio = 2;
        w2.duracion = 5;

        tw.episodios.add(w2);

        ww.temporadas.add(t1);
        ww.temporadas.add(tw);

        Pooflix.CatalogoSeries.add(ww);
        
        



    }

}
