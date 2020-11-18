package PacoteJava4;
import java.util.*;
public class SomaDosPositivos8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n=1, soma = 0,contador=0, contadorM;
		float media, R;
		while(n>0) {
			System.out.println("Digite um número inteiro: ");
			n= ler.nextInt();
			
			soma = soma+n;
			contador++;
			
		}
		R = contador -1;
		System.out.println("Soma: " + soma + "\nMédia: " + soma/R);
		
	}
}
