import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        int par=0, impar=0, pos=0, neg=0;
        for(int i=0; i<n.length; i++){
            n[i]=sc.nextInt();
            if(n[i]%2==1 || n[i]%2==-1){
                impar++;
                if(n[i]%2==1){
                    pos++;
                }
                else{
                    neg++;
                }
            }
            else if(n[i]%2==0){
                par++;
                if(n[i]>0){
                    pos++;
                }
                else if(n[i]<0){
                    neg++;
                }
            }
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");
        sc.close();
    }
 
}
