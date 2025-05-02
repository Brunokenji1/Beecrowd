import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opc=1;
        double media;
        do{
            double n1=sc.nextDouble();
            while(n1<0 || n1>10){
                System.out.println("nota invalida");
                n1=sc.nextDouble();
            }
            double n2=sc.nextDouble();
            while(n2<0 || n2>10){
                System.out.println("nota invalida");
                n2=sc.nextDouble();
            }
            media=(n1+n2)/2;
            System.out.printf("media = %.2f%n",media);
            System.out.println("novo calculo (1-sim 2-nao)");
            opc=sc.nextInt();
            while(opc<1 || opc>2){
                System.out.println("novo calculo (1-sim 2-nao)");
                opc=sc.nextInt();
            }        
        }while(opc!=2);
        sc.close();
    }
}
