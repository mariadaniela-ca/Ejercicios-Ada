import java.util.*;
 /**
  * Ejercicio04
    Dado un conjunto de 15 valores positivos desarrollar un programar que imprima el valor maximo dentro del conjunto 
    y su posicion relativa
  */
 public class Ejercicio04 {
    public static Scanner Teclado= new Scanner(System.in);

    public static void main(String[] args) {
        int valorMayor=0; // Valor mayor del conjunto de valores ingresados 
        int posicion=0; // Posicion en la que se encuentra el valor mayor 
    
        for (int i = 0; i < 15; i++) {
            int valor; //valor ingresado por pantalla
            System.out.println("Ingrese el valor");
            valor = Teclado.nextInt();
            if ( valor > valorMayor){
                valorMayor = valor;
                posicion = i+1;   
            }
        }
        System.out.println("El valor mayor ingresado es: "+ valorMayor + " En la posicion:  "+ posicion);
    } 
 }