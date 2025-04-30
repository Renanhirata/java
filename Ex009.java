/******************************************************************************

Exercicio 009
Faça um programa para uma loja de tintas. 
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

*******************************************************************************/
import java.util.Scanner;
public class Ex009
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int areaDesejada, latasTintas, precoTotal, litrosTintas;
		
		System.out.println("===========BEM-VINDO A LOJA!!===========");
		System.out.println("Qual o tamanho em m² da área a ser pintada");
		areaDesejada=ler.nextInt();
		
		litrosTintas = (areaDesejada + 2) / 3;      
        latasTintas = (litrosTintas + 17) / 18;   
        precoTotal =  latasTintas * 80;
        
        System.out.println("Latas necessárias: " + latasTintas);
        System.out.println("Preço total: R$ " + precoTotal);
	}
}
