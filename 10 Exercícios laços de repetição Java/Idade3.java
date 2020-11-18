package PacoteJava4;
import java.util.*;
public class Idade3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, menos=0, mais=0;
		while(idade!=-99) {
			System.out.println("Qual sua idade?");
			idade = ler.nextInt();
			if(idade<=21) {
				
				menos++;
				
			}
			else {
				mais++;
			}
		}
		System.out.println("Menores de 21:" + (menos-1)+"\nMaiores de 50: "+ mais);
	}
}
