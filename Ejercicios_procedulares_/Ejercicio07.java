import java.util.*;

/**
 * Ejercicio07
    El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le
    permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
    Las tarifas que se tienen son las siguientes:
    a. Las dos primeras horas a $5.00 c/u.
    b. Las siguientes tres a $4.00 c/u.
    c. Las cinco siguientes a $3.00 c/u.
    d. Después de diez horas el costo por cada una es de dos pesos.
 */
public class Ejercicio07 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int horas;
        int contador=0;
        int precioDe2Horas=5;
        int precioDe3a5Horas=4;
        int precioDe6a10Horas=3;
        int precioDe11HorasOMas=2;

        System.out.println("Ingrese la cantidad de horas");
        horas= Teclado.nextInt();

       if(horas>0 && horas<=2){
            contador=(horas*precioDe2Horas);
           
       }else if(horas>=3 && horas<=5){
           contador=(2*precioDe2Horas)+((horas-2)*precioDe3a5Horas); 

       }else if(horas>=6 && horas<=10){
           contador=(2*precioDe2Horas)+(2*precioDe3a5Horas)+((horas-4)*precioDe6a10Horas);

       }else if(horas>=11){
           contador=(2*precioDe2Horas)+(2*precioDe3a5Horas)+(5*precioDe6a10Horas)+((horas-9)*precioDe11HorasOMas);

    
    }
    System.out.println("EL monto a pagar es: $"+contador);
}
}

