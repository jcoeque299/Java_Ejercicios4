import java.util.ArrayList;
import java.util.Random;

public class ejercicio9 {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer numeroGenerado = 0;
        while (numeroGenerado != 24) {
            numeroGenerado = rand.nextInt(100);
            if (numeroGenerado%2 == 1) {
                numeros.add(numeroGenerado+1);
            }
            else {
                numeros.add(numeroGenerado);
            }
        }
        System.out.println("Se han generado " + numeros.size() + " numeros");
        System.out.println(numeros.toString());
    }
}
