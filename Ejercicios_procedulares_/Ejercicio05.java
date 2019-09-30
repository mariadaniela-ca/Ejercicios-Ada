import java.util.*;

/**
 * Ejercicio05
    Un empleado de la tienda “Tiki Taka” realiza N ventas durante el día, se requiere
    saber cuántas de ellas fueron mayores a $1000, cuántas fueron mayores
    a $500 pero menores o iguales a $1000, y cuántas fueron menores o
    iguales a $500. Además, se requiere saber el monto de lo vendido en cada
    categoría y de forma global. Realice un algoritmo que permita determinar
    lo anterior.
 */
public class Ejercicio05 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroVentas;
        double montoTotalDeVentas=0;
        int monto1=0; //  cantidad de ventas con montos menores a 500$
        int monto2=0; //  cantidad de ventas con montos entre 500$ y 1000$
        int monto3=0; //  cantidad de venta con montos mayores a 1000$
        double montoTotal500=0; // Monto total de las ventas menores 500$
        double montoTotalDe500a1000=0; // Monto total de las ventas entre 500$ y 1000$
        double montoTotal1000=0; // Monto total de las ventas mayores a  1000$
        

        System.out.println("Ingrese el numero de ventas");
        numeroVentas = Teclado.nextInt();
        
        for (int i = 0; i < numeroVentas; i++) {
            double montoVenta;
            System.out.println("Ingrese el monto de venta");
            montoVenta = Teclado.nextDouble();
            if(montoVenta<=500){
                monto1++;
                montoTotal500 = montoTotal500 + montoVenta;
            }else if(montoVenta>500 && montoVenta<=1000){
                monto2++;
                montoTotalDe500a1000 =montoTotalDe500a1000 + montoVenta;
            }else{
                monto3++;
                montoTotal1000 = montoTotal1000 + montoVenta;
            }
            montoTotalDeVentas= montoTotalDeVentas + montoVenta;   
        }
        System.out.println("La cantidad de ventas menores a 500$ es de: "+ monto1 + ", y el importe total es : "+montoTotal500+ "$");
        System.out.println("La cantidad de ventas entre 500$ y 1000$ es de: "+ monto2 + ", y el importe total es : "+montoTotalDe500a1000+ "$");
        System.out.println("La cantidad de ventas mayores a 1000$ es de: "+ monto3 + ", y el importe total es : "+montoTotal1000+ "$");
        System.out.println("La venta total del día es: "+ montoTotalDeVentas+"$");
    }
}



/*En la guia se encuentra el ciclo for expresado como i=1,i>10  (esta seria la condicion de salida, 
la cual debe negarse en el codigo), i=i+1, dentro de un cuadrado, lo que se traduce a
for (int=1, i<=10, i++)*/