import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        int x = sc.nextInt();
        int[] y = new int[x];
        long[] fib = new long[60];  //'long' tipo de dado de 64bits, maior que um valor 'int' que é 32bits
        fib[0]=0;
        fib[1]=1;
        for(int i=2; i<60; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0; i<x; i++){
            y[i]=sc.nextInt();
        }        
        for(int i=0; i<x; i++){    
            System.out.println("Fib(" +y[i] +") = "+ fib[y[i]]);
        }
        
        sc.close();
    }
}
