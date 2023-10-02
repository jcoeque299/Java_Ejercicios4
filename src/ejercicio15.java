import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ejercicio15 {
    public static void main(String[] args){
        Random rand = new Random();
        List<String> notasMusicales = List.of("do","re","mi","fa","sol","la","si");
        Integer longitudMelodia = 0;
        ArrayList<String> melodia = new ArrayList<String>(List.of());
        Integer contadorCompas = 1;
        while (!(longitudMelodia%4==0 && longitudMelodia >= 4 && longitudMelodia <=28)) {
            longitudMelodia = rand.nextInt(24)+4;
        }
        while (melodia.size() < longitudMelodia-1) {
            melodia.add(notasMusicales.get(rand.nextInt(notasMusicales.size()-1)));
        }
        melodia.add(melodia.get(0));
        for (String nota: melodia) {
            System.out.print(nota + " ");
            if (contadorCompas%4 == 0) {
                System.out.print("| ");
            }
            contadorCompas += 1;
        }
        System.out.print("| ");
    }
}
