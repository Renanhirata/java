/******************************************************************************

Exercicio 018
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

*******************************************************************************/
import java.util.Scanner;
public class Ex018
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1, n2;
		System.out.println("Insira um número: ");
		n1 = ler.nextInt();
		System.out.println("Insira um número: ");
		n2 = ler.nextInt();
		
		int i,f;
		
		if (n1 < n2){
		    i=n1;
		    f=n2;
		}
		else{
		    i=n2;
		    f=n1;
		}
		System.out.println("Números entre " + n1 + " e " + n2 + ": ");
		for (int i1 = i + 1; i1 < f; i1++){
	   System.out.println(i1);
		}
	}
}