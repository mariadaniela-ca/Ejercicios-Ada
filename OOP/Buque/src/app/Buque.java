package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Buque
 */
public class Buque {
    public String nombre;
    public int pesoTotaldelBuque=0;
    public List<Contenedor> Contenedores = new ArrayList<Contenedor>();

    public void registrarContenedores() {
        Contenedor cc = new Contenedor(1);
        cc.pesoContenedor = 54;
        cc.idPuertoDeArribo = 1;
        
        Contenedores.add(cc);


        cc = new Contenedor(2);
        cc.pesoContenedor = 28;
        cc.idPuertoDeArribo = 2;

        Contenedores.add(cc);

        cc = new Contenedor(3);
        cc.pesoContenedor = 68;
        cc.idPuertoDeArribo = 1;

        Contenedores.add(cc);

        cc = new Contenedor(4);
        cc.pesoContenedor = 34;
        cc.idPuertoDeArribo = 3;

        Contenedores.add(cc);

        cc = new Contenedor(4);
        cc.pesoContenedor = 15;
        cc.idPuertoDeArribo = 2;

        Contenedores.add(cc);

        cc = new Contenedor(5);
        cc.pesoContenedor = 26;
        cc.idPuertoDeArribo = 3;

        Contenedores.add(cc);

        cc = new Contenedor(6);
        cc.pesoContenedor = 22;
        cc.idPuertoDeArribo = 3;

        Contenedores.add(cc);

        cc = new Contenedor(7);
        cc.pesoContenedor = 15;
        cc.idPuertoDeArribo = 1;

        Contenedores.add(cc);

       
        

    }

   
}