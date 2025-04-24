import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        int[] x = new int[3];

        for(int i=0; i<3; i++){
            x[i]=sc.nextInt();
        }
        int[] org = x.clone();
        Arrays.sort(org);
        for(int i=0; i<3; i++){
            System.out.println(org[i]);
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println(x[i]);
        }
        sc.close();
    }
}
