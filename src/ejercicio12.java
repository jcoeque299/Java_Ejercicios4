import java.util.Random;

public class ejercicio12 {
    public static void main(String[] args) {
        Random random = new Random();
        int size_linea = 50;

        while (true) {
            for (int x = 0; x < size_linea; x++) {
                int ascii_chr = random.nextInt(95) + 32;
                char chr = (char) ascii_chr;
                System.out.print(chr);
            }
            System.out.println();
        }
    }
}
