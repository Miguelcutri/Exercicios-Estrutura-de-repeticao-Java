package PacoteJava4;
import java.util.*;
public class Contagem10 {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int contador=0;
		
		do {
			while (contador<=233) {
				contador++;
				System.out.println(contador);
			}
			contador = contador + 3;
			System.out.println(contador);
			
		}while(contador<=456);
	}

	
}
