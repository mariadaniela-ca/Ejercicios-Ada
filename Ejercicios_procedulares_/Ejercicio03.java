import java.util.*;

/**
 * Ejercicio04
        Dado un conjunto de valores cada uno de los cuales representa el sueldo de un empleado, 
        excepto el ultimo que es 0 e indica el final del conjunto,desarrollar un programa que determine e imprima:
            -Cuantos empleados ganan menos de 520 pesos.
            -Cuantos ganan entre 520 - 780
            -Cuantos ganan entre 780 - 999
            -Cuantos ganan mas de 999
 */
public class Ejercicio03 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        double sueldo;
        int empleados1=0;
        int empleados2=0; 
        int empleados3=0;
        int empleados4=0;

        System.out.println("Ingrese el sueldo: ");
        sueldo = Teclado.nextDouble();

        while (sueldo>0) {
            if(sueldo>0 && sueldo<520){
                empleados1++;
            }
            if(sueldo>=520 && sueldo < 780){
                empleados2++;
            }else if(sueldo>=780 && sueldo < 999){
                empleados3++;
            }else if(sueldo>=999){
                empleados4++;
            }
            System.out.println("Ingrese el sueldo: ");
            sueldo = Teclado.nextDouble();     
        }

        System.out.println("La cantidad de empleados que ganan menos de 520 pesos es: " + empleados1);
        System.out.println("La cantidad de empleados que ganan entre 520 y 780 pesos es: " + empleados2);
        System.out.println("La cantidad de empleados que ganan entre 780 y 999 pesos es: " + empleados3);
        System.out.println("La cantidad de empleados que ganan mas de 999 es: " + empleados4);
    }
}