import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        int[] x = new int[15];
        int[] par = new int[5];
        int[] impar = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<15; i++){
            x[i]=sc.nextInt();
            if(0==x[i]%2){
                par[i]=x[i];
            }
            else{
                impar[i]=x[i];
            }
            
        }
        
        
 
    }
 
}
 
    }
 
}
