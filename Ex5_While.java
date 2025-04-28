/******************************************************************************
 Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. 
 Utilize while.

*******************************************************************************/
public class Ex5_While
{
	public static void main(String[] args) {
		int soma = 0;
		int i = 2;
		
		while (i <= 100) {
		soma += i;
		System.out.println("Somando " + i + ": " + soma);
		i += 2; 
		}
		
		System.out.println("A soma total dos números pares de 1 a 100 é: " + soma);
	}
}
