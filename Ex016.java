/******************************************************************************

Exercicio 016
Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
Dica: utilize o operador módulo (resto da divisão).

*******************************************************************************/
import java.util.Scanner;
public class Ex016
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n;
		System.out.println("Informe um número: ");
		n = ler.nextInt();
		System.out.println("O número informado foi: " + n);
	}
}