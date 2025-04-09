/******************************************************************************

40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. 
Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e 
exibir quantos litros ele conseguiu colocar no tanque.

*******************************************************************************/
import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double litros, gasolina, valor;
	
	System.out.println("Preço do litro da gasolina: ");
	gasolina= ler.nextDouble();
	System.out.println("Valor do pagamento: ");
	valor= ler.nextDouble();
	 litros = valor / gasolina;
	 
	 System.out.println("O valor foi de " + valor + "R$, o motorista consegue colocar " + litros + " litros de gasolina");
	}
}
