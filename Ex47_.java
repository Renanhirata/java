/******************************************************************************

Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/
import java.util.Scanner;
public class Ex47_
{
	public static void main(String[] args) {
		int[] numeros = new int [20];
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<20; i++) {
		System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
		numeros[i]= ler.nextInt();
		}
		System.out.println("Números em ordem inversa: ");
		for(int i=19; i>=0; i--) {
		    System.out.println(numeros[i]);
		}
	}
}
