import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[12][12];
        String oper=sc.next();
        double soma=0, cont=0, media=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                m[i][j]=sc.nextDouble();
            }
        }
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                if(j>i && i<(m.length)/2 && (i+j)<(m.length-1)){
                    soma+=m[i][j];
                    cont++;
                } 
            }
        }
        media=soma/cont;
        if(oper.equals("S")){
            System.out.printf("%.1f%n",soma);
        }
        if(oper.equals("M")){
            System.out.printf("%.1f%n",media);
        }

        sc.close();
    }
 
}
