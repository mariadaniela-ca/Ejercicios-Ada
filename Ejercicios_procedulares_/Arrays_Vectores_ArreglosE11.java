import java.util.*;

/**
 * Arrays_Vectores_Arreglos Arreglos-> Listas -> Pilas, Colas, Hash Tables
 * equals: Para igualar un string en objeto( es como utilizar ==) Ya no se le
 * dice vectores, es un término viejo.
 * 
 * Ejercicio11: Dados 10 numeros que represetan edades calcular el promedio,
 * imprimirlo e imprimir todas las edades ingresadas
 */
public class Arrays_Vectores_ArreglosE11{

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] edades = new int[4];
        int suma =0 ;
        int promedio;

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese la edad nro " + (i+1));
            int numero = Teclado.nextInt();

            edades[i] = numero;

        }

        for (int i = 0; i < 4; i++) {
            suma = suma + edades[i];

        }
        promedio = suma/4;
        System.out.println("El promedio es: "+promedio);

        for (int i = 0; i < 4; i++) {

            System.out.println("Las edades son: " + edades[i]);

        }

    }
}