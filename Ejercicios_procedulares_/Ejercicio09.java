import java.util.*;

/**
 * Ejercicio09 Dado un numero que representa un año imprimir si es bisiesto o no.
 */
public class Ejercicio09 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int anio;
        System.out.println(" Ingrese un año para saber si es bisiesto o no");
        anio = Teclado.nextInt();
        //boolean resultado = esBisiesto(anio);

        if (esBisiesto(anio)) {
            System.out.println(" El año " + anio + " es bisiesto");
        } else {
            System.out.println(" El año " + anio + " no es bisiesto");
        }
    }

    private static boolean esBisiesto(int anio) {
        if (anio % 400 == 0 && (anio % 4 == 0 || anio % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}