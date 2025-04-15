import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dinheiro = sc.nextDouble()*100;
        int dinheiro_int = (int)dinheiro;
        
        int[] Nota = {10000, 5000, 2000, 1000, 500, 200};
        int[] qNota = new int[6];
        int[] Moeda = {100, 50, 25, 10, 5, 1};
        int[] qMoeda = new int[6];   
        
        double[] moeda = {1, 0.50, 0.25, 0.10, 0.05, 0.01}; 

        for (int i=0; i<6; i++){
            if(dinheiro_int>=Nota[i]){
                qNota[i]=dinheiro_int/Nota[i];  
                dinheiro_int=dinheiro_int%Nota[i];  
            }
        }
        for (int i=0; i<6; i++){
            if(dinheiro_int>=Moeda[i]){
                qMoeda[i]=dinheiro_int/Moeda[i];
                dinheiro_int=dinheiro_int%Moeda[i];
            }
        }
        System.out.println("NOTAS:");
        for (int i=0;i<6; i++){
            System.out.printf("%d nota(s) de R$ %d.00\n", qNota[i], Nota[i]/100);
        }
        System.out.println("MOEDAS:");
        for (int i=0;i<6; i++){
            System.out.printf("%d moeda(s) de R$ %.2f\n", qMoeda[i], moeda[i]);
        }
        sc.close();
    }    
}
