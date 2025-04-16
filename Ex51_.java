/******************************************************************************

Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. 
Calcule e escreva o maior, menor e a média desses números.
===================================================
Ex.:        import java.util.Random;
            // Criar um gerador de números aleatórios
            Random random = new Random();
===================================================
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Ex51_
{
	public static void main(String[] args) {
		int[] numeros = new int [10];
		Random random = new Random();
		int maior = 0;
		int menor = 100;
		int soma = 0;
	    double media = 0;
		
		System.out.println("Números sorteados:");
		for (int i = 0; i < 10; i++) {
			numeros[i] = random.nextInt(101); 
			System.out.println("Posição " + i + ": " + numeros[i]);

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			 soma = soma + numeros[i];
		}
		
		media = soma / 10.0;

		System.out.println("\nMaior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Média dos números: " + media);
	}
}
