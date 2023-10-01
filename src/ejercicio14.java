import java.util.Random;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Introduzca un numero para que lo adivine: ");
        int num = Integer.parseInt((lectura.next()));
        int intentos = 5;

        while (intentos > 0) {
            int random_num = random.nextInt(101); // Adivina un número aleatorio

            System.out.println("\nEstas pensando en el " + random_num + "?");
            System.out.print("Correcto (c), Menor (m) o Mayor (M): ");
            char respuesta = lectura.next().charAt(0);

            if (respuesta == 'c' || respuesta == 'C') {
                System.out.println("\nHe adivinado el numero!");
                break;
            } else if (respuesta == 'm') {
                System.out.println("El numero es menor.");
            } else if (respuesta == 'M') {
                System.out.println("El numero es mayor.");
            }
            intentos--;

            if (intentos == 0) {
                System.out.println("\nNo he adivinado el numero...");
            }
        }
    }
}
