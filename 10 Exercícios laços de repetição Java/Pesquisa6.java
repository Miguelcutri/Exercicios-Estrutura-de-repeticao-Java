package PacoteJava4;
import java.util.*;
public class Pesquisa6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int habitante, filhos, contador=0, mediaFilhos, totalFilhos = 0, salarioMaior = 0, percentual = 0, porcentagem;
		float salario = 0, media, total=0;
		
		for (habitante=1; habitante<=5; habitante++) {
			System.out.println(habitante+"-Qual seu salário?");
			salario = ler.nextFloat();
			
			System.out.println(habitante+"-Quantos filhos você tem?");
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
		
		System.out.println("A média do salário é R$"+media+"\nA média do número de filhos é:"+ mediaFilhos+
				"\nO maior salário é R$" + salarioMaior + "\nA porcentagem de habitantes que recebem o salário menor que R$100 é "
				+ porcentagem+"%");
		
	}

}
