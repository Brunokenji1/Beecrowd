import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        double[] t=new double[3];
        for(int i=0; i<3; i++){
            t[i]=sc.nextDouble();
        }
        Arrays.sort(t);
        if(t[2]>=t[1]+t[0]){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if(Math.pow(t[2], 2)==Math.pow(t[1], 2)+ Math.pow(t[0],2)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(t[2], 2)>Math.pow(t[1], 2)+Math.pow(t[0], 2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            
            if(Math.pow(t[2], 2)<Math.pow(t[1], 2)+Math.pow(t[0], 2)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(t[2]==t[1] && t[2]==t[0]){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if((t[2]==t[1] && t[2]!=t[0]) || (t[2]==t[0] && t[2]!=t[1]) || (t[1]==t[0] && t[1]!=t[2])){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
 
}
