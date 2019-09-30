import java.util.*;


/**
 * Ejercicio06
    Un compañia de paqueteria internacional tiene servicio en algunos paises de America del norte, America Central , America del sur 
    Europa y Asia. El costo por el servicio de paquetería se basa en el peso y la zona a la que va dirigido.
    Parte de la politica implica que los paquetes con un peso superior a 5kg no son transportados, esto por cuestiones de logistica
    y de seguridad. Realice el algoritmo para determinar el cobro por la entrega de un paquete o en su caso, el rechazo de la
    entrega;

 */
public class Ejercicio06 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double pesoDelPaquete;
        int ubicacion; 
        double costo;

        System.out.println(" Indique el peso del paquete en gramos");

        pesoDelPaquete = Teclado.nextInt();

       if(pesoDelPaquete<=5000){
            
            System.out.println(" Indique el numero correspondiente a la zona donde se realizará el envío");
            System.out.println(" 1 : America del Norte");
            System.out.println(" 2 : America Central");
            System.out.println(" 3 : America del Sur");
            System.out.println(" 4 : Europa");
            System.out.println(" 5 : Asia");

            ubicacion = Teclado.nextInt();

            while (ubicacion <=0 || ubicacion > 5) {
                System.out.println("La zona ingresada es inválida");
                System.out.println(" Indique el numero correspondiente a la zona donde se realizará el envío");
                System.out.println(" 1 : America del Norte");
                System.out.println(" 2 : America Central");
                System.out.println(" 3 : America del Sur");
                System.out.println(" 4 : Europa");
                System.out.println(" 5 : Asia");

            ubicacion = Teclado.nextInt();
                
            }

                switch (ubicacion) {
                    case 1:
                        costo = (pesoDelPaquete * 11.00); // $11.00 es el precio de costo/gramo a America del Norte
                        System.out.println("El costo por enviar "+ pesoDelPaquete +" g a America del Norte es de: $"+ costo);
                        break;
    
                    case 2:
                        costo = (pesoDelPaquete * 10.00); //$10.00 es el precio de costo/gramo a America Central
                        System.out.println("El costo por enviar "+ pesoDelPaquete+" g a America Central es de: $"+ costo);
                        break;
    
                    case 3:
                        costo = (pesoDelPaquete * 12.00);  //$12.00 es el precio de costo/gramo a America del Sur
                        System.out.println("El costo por enviar "+ pesoDelPaquete+" g a America del Sur es de: $"+ costo);
                        break;
    
                    case 4:
                        costo = (pesoDelPaquete * 24.00);  //$24.00 es el precio de costo/gramo a Europa
                        System.out.println("El costo por enviar "+ pesoDelPaquete+" g a Europa es de: $"+ costo);
                        break;
    
                    case 5:
                        costo = (pesoDelPaquete * 27.00);  //$27.00 es el precio de costo/gramo a Asia
                        System.out.println("El costo por enviar "+ pesoDelPaquete+" g a Asia es de: $"+ costo);
                        break;
                
                    default:
                        break;
                }
            }else {
            System.out.println(" El paquete supera el peso máximo permitido para realizar el envío");
        }
    }
}