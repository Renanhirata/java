/******************************************************************************

Exercicio 003
Faça um Programa que peça as 4 notas bimestrais e mostre a média.

*******************************************************************************/
import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira sua 1° nota");
		nota1 = ler.nextDouble();
		System.out.println("Insira sua 2° nota");
		nota2 = ler.nextDouble();
		System.out.println("Insira sua 3° nota");
		nota3 = ler.nextDouble();
		System.out.println("Insira sua 4° nota");
		nota4 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("Sua média neste bimestre é: " +media);
	}
}
