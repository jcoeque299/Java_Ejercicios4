import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args){
        Random rand = new Random();
        List<String> numeros = List.of("2","3","4","5","6","7","8","9","Sota","Caballo","Rey","As");
        List<String> palos = List.of("Copas", "Oros","Espadas","Bastos");
        System.out.println(numeros.get(rand.nextInt(numeros.size())) + " de " + palos.get(rand.nextInt(palos.size() - 1)));
    }
}
