import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] vel = new int[n];
            int maior=0;
            for(int i=0; i<n; i++){
                vel[i]=sc.nextInt();
                if(vel[i]>maior){
                    maior=vel[i];
                }
            }
            if(maior<10){
                        System.out.println("1");
                    }
                    else if(maior>=10 && maior<20){
                        System.out.println("2");
                    }  
                    else if(maior>=20){
                        System.out.println("3");
                    }
            
        }
        sc.close();
    }
 
}
