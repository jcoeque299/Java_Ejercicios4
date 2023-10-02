import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicio11 {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<String> notas = new ArrayList<String>(List.of());
        List<String> notasPosibles = List.of("Suspenso", "Suficiente", "Bien", "Notable", "Sobresaliente");
        ArrayList<Integer> cantidadNotas = new ArrayList<>(List.of(0, 0, 0, 0, 0));
        String notaElegida = "";
        for (int cont = 0; notas.size() < 20; cont++) {
            notaElegida = notasPosibles.get(rand.nextInt(5));
            switch (notaElegida) {
                case "Suspenso":
                    cantidadNotas.set(0, cantidadNotas.get(0)+1);
                    break;
                case "Suficiente":
                    cantidadNotas.set(1, cantidadNotas.get(1)+1);
                    break;
                case "Bien":
                    cantidadNotas.set(2, cantidadNotas.get(2)+1);
                    break;
                case "Notable":
                    cantidadNotas.set(3, cantidadNotas.get(3)+1);
                    break;
                case "Sobresaliente":
                    cantidadNotas.set(4, cantidadNotas.get(4)+1);
                    break;
            }
            notas.add(notaElegida);
        }
        System.out.println("Suspensos: " + cantidadNotas.get(0) + "\nSuficientes: " + cantidadNotas.get(1) + "\nBien: " + cantidadNotas.get(2) + "\nNotables: " + cantidadNotas.get(3) + "\nSobresalientes: " + cantidadNotas.get(4));
    }
}
