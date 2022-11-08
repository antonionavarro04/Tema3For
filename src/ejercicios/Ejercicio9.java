package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio9 {
    public static void main(String[] args) {
        // ? Programa Java que pida un numero y muestre si es primo o no
        // ^ Declaramos la variable n (numero introducido)
        long n;
        boolean esPrimo = true;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el numero
        System.out.print("Introduce un número: ");
        n = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Bucle for en el cual primero comprobaremos si es par diferente de 2, de ser así no es primo. Luego comprobaremos si siendo impar es divisible entre 3, 5, 7 y 11. Si es divisible por alguno de ellos no es primo.
        for (byte i = 2; i <= 11; i++) {
            if (n % i == 0 && n != i){ // * Si el numero es divisible entre i y no es igual a i
                esPrimo = false; // * Cambiamos el valor de esPrimo a false
            }
        }
        
        // ! Mostramos si el numero es primo o no
        System.out.println(esPrimo ? "El número " + n + " es primo" : "El número " + n + " no es primo");
    }    
}
