import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            n+=1;
        }
        for(int i=0; i<6; i++){
            System.out.println(n+(i*2));
        }


        sc.close();
    }
 
}
