import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op=a;
        for(int i=0; i<b; i++){
            String opc=sc.next();
            if(opc.equals("fechou")){
                op++;
            }
            else{
                op--;
            }

        }
        System.out.println(op);
        sc.close();
    }
 
}
