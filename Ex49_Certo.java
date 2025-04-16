/******************************************************************************

Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.

*******************************************************************************/
import java.util.Scanner;
public class Ex49_
{
	public static void main(String[] args) {
		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];
		int[] soma = new int[10];
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira os elementos do vetor:");
		for(int i=0; i<10; i++) {
		    System.out.print("Elemento " + (i + 1) + ": ");
		    numeros1[i]=ler.nextInt();
		}
		System.out.println("Insira os elementos do vetor:");
		for(int i=0; i<10; i++){
		    System.out.println("Elemento " +(i+1)+ ": ");
		    numeros2[i]=ler.nextInt();
		}
		for(int i=0; i<10; i++){
		    soma[i]=numeros1[i] + numeros2[i];
	}
	System.out.println("Digite os 10 elementos do segundo vetor:");
	for (int i = 0; i < 10; i++) {
	    System.out.println("Elemento " + (i + 1) + ": " + soma[i]);
	}
	}
}
