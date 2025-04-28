/******************************************************************************

Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. 
Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Ex3_While
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int numero, tabuada = 1;
	    
		System.out.println("Escolha o número: ");
		numero = ler.nextInt();
		
		while (tabuada <= 10){
		System.out.println(numero + " . " + tabuada + " = " + (numero * tabuada));
		tabuada++;
		}
	}
}
