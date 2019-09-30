import java.util.*;
/**
 * Ejercicio02
        Dados 2 valores enteros imprimir si el primero es mayor al segundo o menor o igual.
 */
public class Ejercicio02 {
    public static Scanner Teclado= new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Ingrese el primer numero");
        a = Teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        b = Teclado.nextInt();

        if(a==b){
            System.out.println("Los numeros son iguales");
        }else if (a>b){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor");
        }
    }
}