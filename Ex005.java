/******************************************************************************

Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.

*******************************************************************************/
import java.util.Scanner;
public class Ex005
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ganhoHora, horaTrabalhada, salarioTotal; 
		
		System.out.println("Insira quanto ganha por hora: ");
		ganhoHora=ler.nextDouble();
		System.out.println("Insira números de horas trabalhadas: ");
		horaTrabalhada=ler.nextDouble();
		
		salarioTotal = ganhoHora * horaTrabalhada;
		System.out.println("Seu salário ao dim do mês será : " +salarioTotal);
	}
}
