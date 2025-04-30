/******************************************************************************

Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,

informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.

*******************************************************************************/
import java.util.Scanner;
public class Ex014
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioAtual, aumentoSalarial, salarioFinal;
		
		System.out.println("Insira o salário do funcionário: ");
		salarioAtual = ler.nextInt();
		
		if(salarioAtual < 280){
		aumentoSalarial = salarioAtual * 0.20;
		salarioFinal = salarioAtual + aumentoSalarial;
		 System.out.println("Salário inicial do aumento: " + salarioAtual + "R$");
		 System.out.println("O aumento foi de 20%");
		 System.out.println("Houve um aumento de: " + aumentoSalarial + "R$");
		 System.out.println("O Salário final será de: " + salarioFinal + "R$");
		}
		else if(salarioAtual > 280 && salarioAtual < 700){
		aumentoSalarial = salarioAtual * 0.15;
		salarioFinal = salarioAtual + aumentoSalarial;
		 System.out.println("Salário inicial do aumento: " + salarioAtual + "R$");
		 System.out.println("O aumento foi de 15%");
		 System.out.println("Houve um aumento de: " + aumentoSalarial + "R$");
		 System.out.println("O Salário final será de: " + salarioFinal + "R$");
		}
		 else if(salarioAtual > 700 && salarioAtual < 1500){
		aumentoSalarial = salarioAtual * 0.10;
		salarioFinal = salarioAtual + aumentoSalarial;
		 System.out.println("Salário inicial do aumento: " + salarioAtual + "R$");
		 System.out.println("O aumento foi de 10%");
		 System.out.println("Houve um aumento de: " + aumentoSalarial + "R$");
		 System.out.println("O Salário final será de: " + salarioFinal + "R$");
		 }
		 else if(salarioAtual >= 1500){
		aumentoSalarial = salarioAtual * 0.05;
		salarioFinal = salarioAtual + aumentoSalarial;
		 System.out.println("Salário inicial do aumento: " + salarioAtual + "R$");
		 System.out.println("O aumento foi de 5%");
		 System.out.println("Houve um aumento de: " + aumentoSalarial + "R$");
		 System.out.println("O Salário final será de: " + salarioFinal + "R$");
		 }
	}
}
