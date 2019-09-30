import java.util.*;
/**
 * Ejercicio01
        Dados 3 valores enteros imprimir el promedio.
 */
public class Ejercicio01 {
    public static Scanner Teclado= new Scanner(System.in);
    public static void main(String[] args) {
        
        int a , b , c, suma;
        double promedio;

        System.out.println("Ingrese el primer numero");
        a= Teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        b= Teclado.nextInt();

        System.out.println("Ingrese el tercer numero");
        c= Teclado.nextInt();

        suma=a+b+c;
        promedio=suma/3d;

        System.out.println("El promedio es : " + promedio);


    }
}
