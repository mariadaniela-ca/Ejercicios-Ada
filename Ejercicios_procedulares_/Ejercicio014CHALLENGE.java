import java.util.*;

/**
 * Ejercicio014
 */
public class Ejercicio014CHALLENGE {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        System.out.println("Cantidad de elementos a sumar: ");
        n = Teclado.nextInt();

        int[] elemento1 = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numero "+(i+1));
            elemento1[i]=Teclado.nextInt();
   
        }

        for (int i = 0; i < elemento1.length; i++) {
            if (elemento1[i] != 13) {
                contador = contador + elemento1[i];

            } else {
                i++;
            }
        }
        System.out.println(contador);
    }

}
