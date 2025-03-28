import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, numero=0;
        n = sc.nextInt();
        
        int[] x = new int[1000];
        
        for (int i=0; i<1000;i++){
            if(numero<n){
                x[i] = numero;
                numero++;
            }
            else{
                numero=0;
                x[i] = numero;
                numero++;
                
            }
        }
        for (int i=0; i<1000; i++){
            System.out.printf("N[%d] = %d\n", i, x[i]);
        }
    }
 
}
