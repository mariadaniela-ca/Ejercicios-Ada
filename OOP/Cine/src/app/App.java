package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String nombre;
        Cine cine = new Cine();
        

        Sala nuevaSala = new Sala();
        nuevaSala.agregarPeliculas();

        Pelicula pelicula = new Pelicula("bla");
        
        System.out.println("Nombre del comprador");
        nombre = Teclado.nextLine();

        Espectador nuevoEspectador = new Espectador(nombre);
        System.out.println("Ingresar edad del espectador ");
        nuevoEspectador.edad = Teclado.nextInt();

        nuevaSala.traerPelicula("Inglourious Basterds");
        
        nuevaSala.comprobarEdad(nuevoEspectador.edad);
        
    




    }
}