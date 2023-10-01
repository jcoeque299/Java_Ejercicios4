import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num_random = random.nextInt(101);

        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = Integer.parseInt((lectura.next()));

        int intentos = 4;

        do {
            if (num > num_random) {
                System.out.println("Incorrecto");
                System.out.println("El numero introducido es mayor al pensado. Intentos: " + intentos);
                System.out.println("\nIntroduzca un numero: ");
                num = Integer.parseInt((lectura.next()));
            } else if (num < num_random) {
                System.out.println("Incorrecto");
                System.out.println("El numero introducido es menor al pensado. Intentos: " + intentos);
                System.out.println("\nIntroduzca un numero: ");
                num = Integer.parseInt((lectura.next()));
            } else {
                System.out.println("Correcto!");
            }
            intentos--;
        } while (intentos > 0 && num_random != num);
    }
}
