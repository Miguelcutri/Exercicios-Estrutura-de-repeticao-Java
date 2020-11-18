package PacoteJava4;
import java.util.*;
public class MediaDosMultiplos5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int n,soma=0, contador = 0;
		
		float media, R;
		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			
			
			if(n%3==0) {
				soma = soma + n;
				contador++;
			}
		}while(n!=0);
		
		R = contador - 1;
		
		System.out.println("A média dos números múltiplos de 3 é: "+ soma/R);
		
		
	}
}
