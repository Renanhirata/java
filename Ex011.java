/******************************************************************************

Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

*******************************************************************************/
import java.util.Scanner;
public class Ex011
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valorNumero;
		
		System.out.println("Insira um valor do número: ");
		valorNumero= ler.nextInt();
		
		if(valorNumero >=0){
		System.out.println("O valor desse número é positivo: ");
		}
		else if(valorNumero < 0){
		    System.out.println("O valor desse número é negativo: ");
		}
	}
}
