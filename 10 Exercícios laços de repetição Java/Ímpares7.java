package PacoteJava4;
import java.util.*;
public class Ímpares7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,soma = 0;
		for(x=0;x<=500;x++) {
			
			
			if(x%3==0 && x!=0 &&  x%2!=0) {
			soma = soma+x;
			System.out.println(soma);
			}
	}
}
}
