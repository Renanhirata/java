/******************************************************************************

 Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.

*******************************************************************************/
import java.util.Scanner;
public class Ex48_
{
	public static void main(String[] args) {
		double[] numeros = new double [10];
		double soma = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		    System.out.println("Digite o " + (i + 1) + "º número real: ");
		    numeros[i]= ler.nextDouble();
		}
		    for(int i=0; i<10;  i += 2) {
		        soma += numeros[i];
		    }
		    System.out.println("A soma dos valores nas posições ímpares é: " + soma);
	}
}
