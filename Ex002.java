/******************************************************************************

Exercicio 002
Faça um Programa que peça dois números e imprima a soma.

*******************************************************************************/
import java.util.Scanner;
public class Ex002
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, resultado;
		
		System.out.println("Insira o 1° número: ");
		numero1 = ler.nextInt();
		System.out.println("Insira o 2° número: ");
		numero2 = ler.nextInt();
		
		resultado = numero1 + numero2;
		System.out.println("A soma dos números será :" +resultado);
		
	}
}
