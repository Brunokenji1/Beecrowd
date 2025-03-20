import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n, Ncirculado=1;
		n=sc.nextInt();
		int[] numeros= new int[n];
		for(int cont=0; cont<n; cont++) {
			numeros[cont]=sc.nextInt();

		}
		for(int cont=0; cont<n; cont++) {
			if(cont<n-1) {
				if(numeros[cont]!=numeros[cont+1]) {
					Ncirculado=Ncirculado+1;
				}
			}

		}

		System.out.println(Ncirculado);
	}

}
