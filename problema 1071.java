import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int  soma=0, X=0, Y=0;
        if(x>y){
            X=y+1;
            Y=x;
        }
        else if(x<y){
            X=x+1;
            Y=y;
        }
        else{
            x=X;
            y=Y;
        }
        for(int i=X; i<Y; i++){
            if(i%2==1 || i%2==-1){
                soma+=i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
