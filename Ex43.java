/******************************************************************************

43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. 
Imprima o salário inicial, 
o salário com o aumento e o 
salário final.

*******************************************************************************/
import java.util.Scanner;
public class Ex43
{
	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
	double salario, salarioFinal, aumento;
	
	System.out.println("Insira seu salário em R$: ");
	salario= ler.nextDouble();
	aumento = salario * 0.15;
	salarioFinal = aumento * 0.08;
	
	System.out.println("Seu salário inicial foi de: " +salario+ "R$");
	System.out.println("Seu salário com aumento será de: " +aumento+ "R$");
	System.out.println("Seu salário com imposto será de: " +salarioFinal+ "R$");
	}
}
