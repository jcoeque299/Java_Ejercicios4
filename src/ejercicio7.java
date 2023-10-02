import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicio7 {
    public static void main(String[] args){
        Random rand = new Random();
        List<List> apuestas = new ArrayList<>(List.of());
        List<String> resultadosPosibles = List.of("1", "2", "X");
        List<String> resultadosPosiblesPleno = List.of("0","1","2","M");
        for (int cont = 0; apuestas.size() < 14; cont++) {
            apuestas.add(List.of(resultadosPosibles.get(rand.nextInt(3)),resultadosPosibles.get(rand.nextInt(3)),resultadosPosibles.get(rand.nextInt(3))));
            //Para cada apuesta, se crea una lista de 3 apuestas, hasta llegar a los 15 partidos
        }
        apuestas.add(List.of(resultadosPosiblesPleno.get(rand.nextInt(4)),resultadosPosiblesPleno.get(rand.nextInt(4)),resultadosPosiblesPleno.get(rand.nextInt(4))));
        //Añade las 3 ultimas apuestas para el pleno
        for (List apuesta: apuestas) {
            System.out.println(apuesta.toString());
        }
    }
}
