import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble();

        for(int cont=0; cont<100; cont++){
            if(x>=0){
                System.out.printf("N[%d] = %.4f\n", cont, x);
                x=x/2;
            }
            else{
                break;
            }
        }
 
    }
 
}
