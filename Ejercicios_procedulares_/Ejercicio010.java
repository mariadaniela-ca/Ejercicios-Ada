import java.util.*;

/**
 * Ejercicio010 Dado el ingreso de un oración caracter por caracter, hacer un
 * programa en Java q cuente: cantidad de vocales, espacios y puntos.
 */
public class Ejercicio010 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        char caracter;
        int vocales = 0;
        int espacios = 0;

        System.out.println("Ingrese una oración letra por letra");
        System.out.println("Ingrese la primera letra");

        caracter = Teclado.nextLine().charAt(0);
        /*
         * Scanner teclado = new Scanner(System.in)// Si se llama dentro de la funcion
         * main la palabra " teclado" va en minusculas.
         */

        while (caracter != '.') {

            if (esVocal(caracter)) {
                vocales++;
            } else if(caracter == ' '){
                espacios++;
            }
            

            System.out.println("Ingrese la siguiente letra");
            caracter = Teclado.nextLine().charAt(0);
        }

        System.out.println("La cantidad de vocales es: " + vocales);
        System.out.println("La cantidad de espacios es: " + espacios);
        System.out.println("La cantidad de puntos es: 1");
    }


    static boolean esVocal(char caracter1) {
        switch (caracter1) {
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