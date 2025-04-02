/******************************************************************************

Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.

*******************************************************************************/
import java.util. Scanner;
public class MediaIdadeEx18
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int idade, somaIdade=0, maior = 0;
	Double media;
	
	for(int i = 1; i <=20; ++i){
	System.out.println("Digite a idade: " +i);
	idade= ler.nextInt();
	somaIdade += idade;
	
	if (idade >=18) {
	maior++;
	}
}
	 media = (double) somaIdade / 20;
	 System.out.println("Soma das idades: " + somaIdade);
    System.out.println("Média das idades: " + media);
    System.out.println("Número de pessoas maiores de idade: " + maior);
	}
}
