/******************************************************************************

Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. 
C = (5 * (F-32) / 9).

*******************************************************************************/
import java.util.Scanner;
public class Ex006
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double grausFarenheit, grausCelsius;
		
		System.out.println("Insira a temperatura em graus Farenheit: ");
		grausFarenheit = ler.nextDouble();
		
		grausCelsius = (5 * (grausFarenheit-32) / 9);
		
		System.out.println("A conversão da temperatura em graus Farenheit para graus Celsius: " +grausCelsius);
	}
}
