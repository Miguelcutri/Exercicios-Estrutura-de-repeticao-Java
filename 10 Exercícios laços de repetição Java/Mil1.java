package PacoteJava4;
import java.util.*;
public class Mil1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x;
		for(x=1000;x<=1999;x++) {
			if (x%11==5) {
				System.out.println(x);
			}
		}
	}

}
