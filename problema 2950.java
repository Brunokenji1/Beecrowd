import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        double icm=(double)n1/(double)(n2+n3) ;
        System.out.printf("%.2f\n", icm);

 
    }
 
}
