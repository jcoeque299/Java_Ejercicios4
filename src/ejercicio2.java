import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        int random_palo = random.nextInt(palos.length);
        int random_numero = random.nextInt(numeros.length);

        System.out.println("Carta: " + numeros[random_numero] + " de " + palos[random_palo]);
    }
}

