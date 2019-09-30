package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Fila
 */
public class Fila {
    public List<Asiento> asientos = new ArrayList<Asiento>();

    public int nroFila;

    public Fila(int numero) {

        this.nroFila = numero;
    }

}