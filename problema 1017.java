import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int tempo, vm, distancia;
        double gasolina;
        tempo = sc.nextInt();
        vm = sc.nextInt();
        distancia = vm*tempo;
        gasolina = distancia/12.0;
        System.out.printf("%.3f\n", gasolina);
 
    }
 
}
