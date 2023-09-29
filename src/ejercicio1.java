import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args){
        Random rand = new Random();
        int resultado = 0;
        for (int cont = 1; cont <= 3; cont++) {
            int numero = rand.nextInt(5);
            System.out.println("Ha salido el numero " + (numero+1));
            resultado += numero+1;
        }
        System.out.println("Suma final: " + resultado);
    }
}