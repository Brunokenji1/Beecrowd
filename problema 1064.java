import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double[] n = new double[6];
        double soma=0, media=0;
        int qtd=0;
        for(int i=0; i<n.length; i++){
            n[i] =sc.nextDouble();
            if(n[i]>0){
                soma+=n[i];
                qtd++;
            }
            media=soma/qtd;
        }
        System.out.println(qtd+ " valores positivos");
        System.out.printf("%.1f\n", media );
        
        sc.close();
    }
 
}
