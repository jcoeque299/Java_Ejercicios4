import java.util.Random;

public class ejercicio13 {
    public static void main(String[] args){
        Random rand = new Random();
        int tirada1 = 0;
        int tirada2 = 7;
        while (tirada1 != tirada2) {
            tirada1 = rand.nextInt(5)+1;
            tirada2 = rand.nextInt(5)+1;
        }
        System.out.println("Los dos dados han salido iguales en el numero " + tirada1);
    }
}
