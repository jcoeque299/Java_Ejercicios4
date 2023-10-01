import java.util.Random;

public class ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        String caracteres = "*-=.|@";

        for (int i = 0; i < 10; i++) {
            int longitud = random.nextInt(40) + 1;
            int i_chr = random.nextInt(caracteres.length());
            char random_chr = caracteres.charAt(i_chr);

            String linea = String.valueOf(random_chr).repeat(longitud);

            System.out.println(linea);
        }
    }
}

