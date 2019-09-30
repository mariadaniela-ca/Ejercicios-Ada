package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido {
    
    public static final String Pooflix = null;
	public List<Temporada> temporadas = new ArrayList<Temporada>();

	public Temporada getTemporada(int nro) {

        for (Temporada t : this.temporadas) {
            // Recorrer cada temporada si el numero de temporada del ciclo es igual a "nro"
            // devolver esa temporada

            if (nro == t.nroTemporada) {
                return t;
            }
        }
        return null;
    }


}