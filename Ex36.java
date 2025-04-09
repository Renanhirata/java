/******************************************************************************


36) Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.

*******************************************************************************/
import java.util.Scanner;
public class Ex36
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		double saldo = 0.0, saque;

         while (true) {
		System.out.println("Menu: ");
		System.out.println("1) Depósito bancário ");
		System.out.println("2) Saque ");
		System.out.println("3) Saldo ");
		System.out.println("4) Sair ");
		opcao = ler.nextInt();
        
		if (opcao == 1) {
		  System.out.println("Insira o valor do Depósito: ");
		  saldo += ler.nextDouble();
		  System.out.println("Depósito APROVADO!");
		}
		else if (opcao == 2) {
		  System.out.println("Insira o valor do Saque: ");
		  saque = ler.nextDouble();
		
		if (saque <= saldo) {
		    saldo -= saque;
		    System.out.println("Saque APROVADO!");
		} else {
		System.out.println("Valor insuficiente");
		}
		}
		else if (opcao == 3) {
		System.out.println("Seu saldo é de: " + saldo);
		}
		else if (opcao == 4) {
		System.out.println("Saindo!");
		break;
		}
		else 
		System.out.println("Inválido tente novamente!");
        }
		

	}
}