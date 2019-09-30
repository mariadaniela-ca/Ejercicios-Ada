package app;


/**
 * Asiento
 */
public class Asiento {

    public String etiquetaDeAsiento;

    public boolean asientoOcupado;

    public Asiento(String etiqueta){
        this.etiquetaDeAsiento = etiqueta;
    }

    public String getEtiquetaDeAsiento() {
        return etiquetaDeAsiento;
    }
    
}