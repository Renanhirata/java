/******************************************************************************

Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.

*******************************************************************************/
import java.util.Scanner;
public class Ex013
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Insira o 1° número: ");
		numero1= ler.nextInt();
		System.out.println("Insira o 2° número: ");
		numero2= ler.nextInt();
		System.out.println("Insira o 3° número: ");
		numero3= ler.nextInt();
		
		if(numero1>numero2 && numero1 > numero3){
		   	System.out.println("O 1° número é o maior: " +numero1); 
		}
		else if(numero2>numero3 && numero2 > numero1){
		    	System.out.println("O 2° número é o maior: " +numero2);
		}
		else if(numero3>numero1 && numero3 > numero2)
			System.out.println("O 3° número é o maior: " +numero3);
	}
}
