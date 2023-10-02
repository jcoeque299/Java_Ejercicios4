import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicio7 {
    public static void main(String[] args){
        Random rand = new Random();
        List<String> apuestas = new ArrayList<>(List.of());
        List<String> resultadosPosibles = List.of("1", "2", "X");
        List<String> resultadosPosiblesPleno = List.of("0","1","2","M");
        for (int cont = 0; apuestas.size() < 14; cont++) {
            apuestas.add(resultadosPosibles.get(rand.nextInt(2)));
        }
        apuestas.add(resultadosPosiblesPleno.get(rand.nextInt(3)));
        for (String apuesta: apuestas) {
            System.out.println(apuesta);
        }
    }
}
