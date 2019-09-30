import java.util.*;

/**
 * Ejercicio08
    Realice un algoritmo que, con base en una calificación proporcionada (0-10), indique con
    letra la calificación que le corresponde: 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5
    a 0 son “F”. Represente el diagrama de flujo y el pseudocódigo.
 */
public class Ejercicio08 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int calificacion;

        System.out.println("Ingrese la calificación");
        calificacion = Teclado.nextInt();

        switch (calificacion) {
            case 10:
                System.out.println("La calificacion correspondiente es 'A' ");
                break;

            case 9:
                System.out.println("La calificacion correspondiente es 'B' ");
                break;

            case 8:
                System.out.println("La calificacion correspondiente es 'C' ");
                break;
            case 7:
            case 6:
                System.out.println("La calificacion correspondiente es 'D' ");
                break;

            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("La calificacion correspondiente es 'F' ");
                break;
     
            default:
                break;
        }
    }
    
}