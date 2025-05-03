import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            if(p!=0){
                if(p%2==0){
                    System.out.print("EVEN ");
                    if(p>0){
                        System.out.println("POSITIVE");
                    }
                    else if(p<0){
                        System.out.println("NEGATIVE");
                    }
                }
                else if(p%2==1 || p%2==-1){
                    System.out.print("ODD ");
                    if(p>0){
                        System.out.println("POSITIVE");
                    }
                    else if(p<0){
                        System.out.println("NEGATIVE");
                    }
                }
            }
            else{
                System.out.println("NULL");
            }
        }    
        sc.close();
    }
}
