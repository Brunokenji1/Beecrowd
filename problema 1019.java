import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int valor,horas=0, minutos=0, segundos=0;
        valor=sc.nextInt();

        minutos=valor/60;
        segundos=valor%60;
        if (minutos>=60){
            horas=minutos/60;
            minutos=minutos%60;
        }
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        
    }
 
}
