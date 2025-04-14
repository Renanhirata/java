/******************************************************************************

Array Entrada de dados

*******************************************************************************/
import java.util.Scanner;
public class ExemploArray02
{
	public static void main(String[] args) {
		int[] numeros = new int [5];
		Scanner ler = new Scanner(System.in);
		//Entrada de dados
		for(int i=0; i <numeros.length; i++){
		    System.out.println("Digite o " +(i+1)+ "° número: ");
		    numeros[i] = ler.nextInt();
		}
		//Saída de dados
		for(int i=0; i <numeros.length; i++){
		    System.out.println("O " + (i+1) + "° número é:" + numeros[i]);
		}
	}
}
