package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catálogo");

        Pooflix.InicializarCatalogo();

        Serie ww = Pooflix.buscaSerie("Westworld");

        Temporada traerTemporada= ww.getTemporada(2);

        Episodio traerUnEpisodio;

        traerUnEpisodio = traerTemporada.getNombreEpisodio("Websodio 1");

        traerUnEpisodio.reproducir();
    }
}