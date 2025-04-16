/******************************************************************************

Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.

*******************************************************************************/
import java.util.Scanner;
public class Ex50_
{
	public static void main(String[] args) {
		int[] valor = new int[10];
		Scanner ler = new Scanner(System.in);
		double total = 0;
		double imposto = 0;
		
		System.out.println("Insira os valores da compra:");
		for(int i=0; i<10; i++) {
		    System.out.print("Produto " + (i + 1) + ": ");
		    valor[i] = ler.nextInt();
		    total += valor[i];
		}
		    
		if (total >= 1200) {
		    imposto = total * 0.025;
		} else {
		    imposto = total * 0.008;
		}

		System.out.println("Valor total sem imposto: " + total);
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor total com imposto: " + (total + imposto));
	}
}