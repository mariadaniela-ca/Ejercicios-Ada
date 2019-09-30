package app;

/**
 * Episodio
 */
public class Episodio{

    public int nroEpisodio;

    public String nombreEpisodio;

    public int duracion;

    public Episodio (String tit){
        this.nombreEpisodio = tit;
    }

    public void reproducir() {

        System.out.println("Reproduciendo " + this.nombreEpisodio + " de la temporada de Websodios");
    }
}