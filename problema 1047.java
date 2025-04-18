import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);        
        int hora=0, minuto=0;
        int hInicial = sc.nextInt();
        int mInicial = sc.nextInt();
        int hFinal = sc.nextInt();
        int mFinal = sc.nextInt();
        if(mInicial>mFinal){
            minuto=60-mInicial+mFinal;
            hInicial++;
            if(hInicial>hFinal){
                hora=(24-hInicial)+hFinal;
            }
            else if(hInicial==hFinal){
                hora=0;
            }
            else{
                hora=hFinal-hInicial;
            }
        }
        if(mInicial<mFinal){
            minuto=mFinal-mInicial;
            if(hInicial>hFinal){
                hora=(24-hInicial)+hFinal;
            }
            else if(hInicial==hFinal){
                hora=0;
            }
            else{
                hora=hFinal-hInicial;
            }
        }
        if(mInicial==mFinal){
            minuto=0;
            if(hInicial>hFinal){
                hora=(24-hInicial)+hFinal;
            }
            else if(hInicial==hFinal){
                hora=24;
            }
            else{
                hora=hFinal-hInicial;
            }
        }
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto +" MINUTO(S)");
        sc.close();
    }
 
}
