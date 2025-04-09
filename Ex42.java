/******************************************************************************

42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. 
Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda,
e a máquina
informe quanto será o valor arrecadado.

*******************************************************************************/
import java.util.Scanner;

public class Ex42
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao, quantidade, roupa, total = 0;

    while (true) {
    System.out.println("Menu: ");
    System.out.println("1) Pequeno (P)");
    System.out.println("2) Médio (M)");
    System.out.println("3) Grande (G) ");
    System.out.println("4) Total ");
    System.out.println("5) Sair ");
    opcao = ler.nextInt();

    if (opcao == 1) {
    System.out.println("Insira a quantidade: ");
    quantidade = ler.nextInt();
    roupa = quantidade * 10;
    total += roupa;
    System.out.println("Valor a ser pago será de: " + roupa + "R$");
      
     } else if (opcao == 2) {
     System.out.println("Insira a quantidade: ");
     quantidade = ler.nextInt();
     roupa = quantidade * 12;
     total += roupa;
     System.out.println("Valor a ser pago será de: " + roupa + "R$");
    
     } else if (opcao == 3) {
     System.out.println("Insira a quantidade: ");
     quantidade = ler.nextInt();
     roupa = quantidade * 15;  
     total += roupa;
     System.out.println("Valor a ser pago será de: " + roupa + "R$");
     
     } else if (opcao == 4) {
    System.out.printf("Total a pagar pelas camisetas: R$ %.2f\n", (double) total);
    
    } else if (opcao == 5) {
    System.out.println("Saindo!");
    break;
      
     } else {
                System.out.println("Opção inválida, por favor, tente novamente.");
            }
        }
    }
}
