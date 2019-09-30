package app;

public class App {
    public static void main(String[] args) throws Exception {


        Persona persona = new Persona();
        persona.nombre = "Ana";
        cambiar(persona);

        System.out.println(persona);
        /*System.out.println("Hello Java");
        Persona personanueva = new Persona("Jose", 'M', 15);

        personanueva.altura = 157;
        indice(personanueva);

    }

    public static void indice(Persona pe) {
        double imc = pe.calcularImc();
        switch (imc) {
        case pe.infraPeso:
            System.out.println("La persona está por debajo de su peso ideal");

            break;
        case pe.pesoIdeal:
            System.out.println("La persona está en su peso ideal");
            break;
        case sobrePeso:
            System.out.println("La persona está por encima de su peso ideal");
        default:
            break;
        }*/

}

public static void cambiar(Persona b){
    b.nombre = "Pedro";
    
}

}