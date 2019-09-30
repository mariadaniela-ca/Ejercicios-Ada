import java.util.*;

/**
 * Ejercicio012 Ingresar un texto seguido, llamar a una funcion que convierte el
 * string ingresado en un arreglo de caracteres
 */
public class Ejercicio013 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String oracion;
        int vocales = 0;
        int espacio = 0;
        int puntos = 0;

        System.out.println("Ingrese una oración");
        oracion = Teclado.nextLine();

        char[] letras;
        letras = oracion.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if (esVocal(letras[i])) {
                vocales++;

            } else if (letras[i] == ' ') {
                espacio++;
            } else if (letras[i] == '.') {
                puntos++;
            }

        }
        System.out.println("La cantidad de vocales es: " + vocales);
        System.out.println("La cantidad de espacios es: " + espacio);
        System.out.println("La cantidad de puntos es: " + puntos);

    }

    static boolean esVocal(char caracter) {
        switch (caracter) {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'U':
        case 'u':

            return true;

        default:
            break;
        }
        return false;
    }

}
