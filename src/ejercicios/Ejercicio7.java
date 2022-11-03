package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Pedir un numero y calcular su factorial mediante un bucle for
        // ^ Declaramos la variable n (numero introducido) y resultado
        long n, resultado = 1;
        long nAux; // * Creamos esta variable para poderla usar en el resultado

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el numero
        System.out.print("Introduce un número: ");
        n = read.nextLong();

        // ! Igualamos las variables
        nAux = n;

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Creamos el Bucle for en el cual iremos decrementando n y se la iremos sumando a la variable resultado
        for (n = nAux; n > 0; n--){
            resultado *= n;
        }

        // ! Mostramos el resultado final
        System.out.println(nAux + "! = " + resultado);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
