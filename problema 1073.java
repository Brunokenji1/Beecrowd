import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            n--;
        }
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i+"^2 = "+(int)Math.pow(i, 2));
            }
        }
        sc.close();
    }
 
}
