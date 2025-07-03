import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            
        
            int n = sc.nextInt();
            double[] t = new double[n];
            double[] d = new double[n];
            double vel;
            double melhor=-1.0;

            for(int i=0; i<n; i++){
                t[i] = sc.nextDouble();
                d[i] = sc.nextDouble();
                vel = (double)d[i]/t[i];
                if(vel>melhor){
                    melhor = vel;
                    System.out.println(i+1);
                }
            }
        }
        sc.close();
        

    }
 
}
