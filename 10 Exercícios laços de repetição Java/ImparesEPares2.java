package PacoteJava4;
import java.util.*;
public class ImparesEPares2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int n, contadorpar=0, contadorimpar=0;
		for(n=0;n<=10;n++) {
			System.out.println(n+"- Digite um número: ");
			n = ler.nextInt();
			
			if (n%2==0) {
				contadorpar++;
			}
			else {
				contadorimpar++;
			}
			
		}
		System.out.println("Pares:"+ contadorpar + "\nÍmpares:" + contadorimpar);

	}
}
