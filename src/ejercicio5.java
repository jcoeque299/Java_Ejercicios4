import java.util.ArrayList;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args){
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        double media = 0;
        int max = 0;
        int min = 200;
        Random rand = new Random();
        for (int cont = 0; numerosAleatorios.size() < 50; cont++) {
            numerosAleatorios.add(rand.nextInt(100)+100);
        }
        for (int numero: numerosAleatorios) {
            media += numero;
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }
        media = media/50;
        System.out.println("La media de los numeros generados es " + media + ", el numero mas pequeño es " + min + ", y el mas grande es " + max);
    }
}
