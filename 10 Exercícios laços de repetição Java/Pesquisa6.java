package PacoteJava4;
import java.util.*;
public class Pesquisa6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int habitante, filhos, contador=0, mediaFilhos, totalFilhos = 0, salarioMaior = 0, percentual = 0, porcentagem;
		float salario = 0, media, total=0;
		
		for (habitante=1; habitante<=5; habitante++) {
			System.out.println(habitante+"-Qual seu sal�rio?");
			salario = ler.nextFloat();
			
			System.out.println(habitante+"-Quantos filhos voc� tem?");
			filhos = ler.nextInt();
			
			contador++;
			total = total + salario;
			totalFilhos = totalFilhos + filhos;
			if (salarioMaior < salario)
				{
				salarioMaior = (int) salario; 
				} 
			if (salario<=100) {
				percentual++;
				
			}
		
		}
		media = total / contador;
		mediaFilhos = totalFilhos / contador;
		porcentagem = (percentual*100)/5;
		
		System.out.println("A m�dia do sal�rio � R$"+media+"\nA m�dia do n�mero de filhos �:"+ mediaFilhos+
				"\nO maior sal�rio � R$" + salarioMaior + "\nA porcentagem de habitantes que recebem o sal�rio menor que R$100 � "
				+ porcentagem+"%");
		
	}

}
