import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int num_random = random.nextInt(11);
            System.out.print(num_random +" ");
        }
    }
}
