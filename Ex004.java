/******************************************************************************

Exercicio 004
Faça um Programa que converta metros para centímetros.

*******************************************************************************/
import java.util.Scanner;
public class Ex004
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros, centimetros;
		
		System.out.println("Insira o valor do metro: ");
		metros = ler.nextDouble();
		
		centimetros = metros * 100;
		System.out.println("O valor convetido de metros para centímetros será: " +centimetros+ "cm");
	}
}
