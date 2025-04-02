/******************************************************************************
 
 Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

*******************************************************************************/
import java.util.Scanner;
public class PessoaNovaEx19
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int idade, idadenovo = 100;
	String nome, nomenovo="" ;
	
	for(int i= 1; i<=10; ++i){
	System.out.println("Insira o nome da " + i + "ª pessoa:");
    nome = ler.nextLine();
	
	System.out.println("Insira a idade da " + i + "ª pessoa:");
	idade= ler.nextInt();
	
	ler.nextLine();
	
	if (idade < idadenovo){
     idadenovo = idade;
     nomenovo = nome;  
   }
}
    System.out.println("A pessoa mais nova é: " + nomenovo);
   }
}
