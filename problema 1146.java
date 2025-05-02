import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int x=1;
        String s ="";
        while(x!=0){ 
            x=sc.nextInt();
            if(x==0){
                break;
            }
            for(int i=1; i<=x; i++){
                if(i==x){
                    s+=i;
                }
                else{
                  s+= i+" ";    
                }
            }
            System.out.println(s);
            s="";
        }
        
        sc.close();
    }
 
}
 
