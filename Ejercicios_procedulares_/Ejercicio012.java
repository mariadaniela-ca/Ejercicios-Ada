import java.util.*;

/**
 * Ejercicio011 Dados 2 arrays de numeros enteros de 7 posiciones, generar un
 * tercer array con 7 elementos donde cada elemento sea la suma de los 2 arrays
 * anteriores.
 */
public class Ejercicio012 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] conjuntoA = new int[7];
        int[] conjuntoB = new int[7];
        int[] conjuntoC = new int[7];

        for (int i = 0; i < 7; i++) {

            System.out.println("Ingrese el numero " + (i + 1) + " del conjunto A");
            conjuntoA[i] = Teclado.nextInt();

            System.out.println("Ingrese el numero " + (i + 1) + " del conjunto B");
            conjuntoB[i] = Teclado.nextInt();

            conjuntoC[i] = conjuntoA[i] + conjuntoB[i];

        }
        System.out.println(" Los numeros pertenecientes al conjunto C son: ");

        for (int i = 0; i < 7; i++) {
            System.out.println("En la posición " + (i + 1) + " : " + conjuntoC[i]);

        }

    }

}