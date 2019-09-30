package app;

/**
 * Persona
 */
public class Persona {

    protected String nombre;

    protected int edad;

    protected int dni;

    protected int peso;

    protected int altura;

    private char sexo;

    public boolean mayorDeEdad;

    public double imc;

    protected char sexoPorDefecto = 'H';

    public static final int infraPeso = -1;

    public static final int pesoIdeal = 0;

    public static final int sobrePeso = 1;

    public Persona(){
        
    }

    public Persona(String nombre_persona, char sexo_persona, int edad_persona) {
        this.nombre = nombre_persona;
        this.peso = sexo_persona;
        this.edad = edad_persona;
        mayorDeEdad = esMayor();
        this.sexo = sexo_persona;
        comprobarSexo();
        this.dni = 0;


    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoPorDefecto;

        }

    }

    public boolean esMayor() {
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularImc() {
        double imC = (peso / altura) * 2d;
        if (imC < 20) {
            return infraPeso;
        } else if (imC >= 20 && imC <= 25) {
            return pesoIdeal;

        } else {
            return sobrePeso;
        }

    }

    public String toString() {
        return ("Persona: " + nombre + "\n" + "Edad: " + edad + "\n" + "Sexo: " + sexo + "\n" + "Es mayor de edad?: "
                + mayorDeEdad + "\n" + "El calculo del IMC arroja: " + imc);

    }
}
