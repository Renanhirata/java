/******************************************************************************

Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.

*******************************************************************************/
import java.util.Scanner;
public class Ex010
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Insira o 1° número: ");
		numero1 = ler.nextInt();
		
		System.out.println("Insira o 2° número:");
		numero2 = ler.nextInt();
		
		if(numero1 > numero2){
		    System.out.println("O maior número é o primeiro:" +numero1 );
		}
		    else if(numero2 > numero1){
		    System.out.println("O maior número é o segundo:" +numero2);
		}
	}
}
