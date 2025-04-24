import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] x = new int[20];
        for(int i=19; i>=0; i--){
            x[i] = sc.nextInt();
        }
        for(int i=0; i<20; i++){
            System.out.printf("N[%d] = %d\n", i, x[i]);
        }
 
    }
 
}
