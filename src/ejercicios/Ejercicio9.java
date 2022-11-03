package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio9 {
    public static void main(String[] args) {
        // ? Programa Java que pida un numero y muestre si es primo o no
        // ^ Declaramos la variable n (numero introducido)
        byte n;
        boolean primo = true;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el numero
        System.out.print("Introduce un número: ");
        n = read.nextByte();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Creamos el Bucle for en el cual iremos comprobando si el numero es divisible entre 2, 3, 5, 7 o 11.
        for ()
    }    
}
