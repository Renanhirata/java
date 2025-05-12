/******************************************************************************

Exercicio 015
Faça um Programa que leia um número e exiba o dia correspondente da semana. 
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

*******************************************************************************/
import java.util.Scanner;
public class Ex015
{
     public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	    int dia;
		System.out.println("Dias da semana: ");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sabádo");
		System.out.print("Insira o número do dia - ");
		dia = ler.nextInt();
		
		if (dia == 1){
		    System.out.println("Você escolheu Domingo!");
		}
		else if (dia == 2){
		    System.out.println("Você escolheu Segunda!");
		}
		else if (dia == 3){
		    System.out.println("Você escolheu Terça!");
		}
		else if (dia == 4){
		    System.out.println("Você escolheu Quarta!");
		}
		else if (dia == 5){
		    System.out.println("Você escolheu Quinta!");
		}
		else if (dia == 6){
		    System.out.println("Você escolheu Sexta!");
		}
		else if (dia == 7){
		    System.out.println("Você escolheu Sabádo!");
		}
	}
}