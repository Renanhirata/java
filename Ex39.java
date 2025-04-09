/******************************************************************************

39 -  Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. 
 Considere sempre anos completos, e que um ano possui 365 dias.
Ex: uma pessoa com 19 anos possui 6935 dias de vida; veja um 
exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS

*******************************************************************************/
import java.util.Scanner;
public class Ex39
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int idade, dia;
	String nome;
	
	System.out.println("Insira o nome: ");
	nome = ler.nextLine();
	System.out.println("Insira a idade: ");
	idade = ler.nextInt();
	dia = idade *365;
	System.out.println(nome+ " você possui "+dia+ " dias:");
	
	
	}
}
