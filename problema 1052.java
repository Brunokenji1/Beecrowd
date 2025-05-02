import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] mes = {"", "January", "February", "March", "April", "May", "June", "July", 
        "August", "September", "October", "November", "December"};
        for(int i=1; i<13; i++){
            if(n==i){
                System.out.println(mes[i]);
            }
        }
        sc.close();
    }
 
}
