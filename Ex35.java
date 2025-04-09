/******************************************************************************

UTILIZE (DO / WHILE) PARA TODOS OS EXERCÍCIOS
35) Faça um programa que leia o nome e o valor de 10 produtos, 
calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a 
 * lista dos produtos comprados e o valor a ser pago.

*******************************************************************************/
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String produto;
        double preco, total = 0;
        String listaProdutos = "";
        int contador = 1;

        while (contador <= 10) {
            System.out.print("Digite o nome do " + contador + "º produto: ");
            produto = ler.nextLine();
            System.out.print("Digite o valor do " + contador + "º produto: ");
            preco = ler.nextDouble();
            ler.nextLine();

            total += preco;
            listaProdutos += contador + " - " + produto + ": R$" + String.format("%.2f", preco) + "\n";
            contador++;
        }

        System.out.println("\nFormas de Pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
        System.out.println("3 - Parcelado no Cartão em 2x (sem juros)");
        System.out.println("4 - Parcelado no Cartão em 3x até 10x (10% de juros)");
        System.out.print("Escolha a forma de pagamento (1 a 4): ");
        int opcao = ler.nextInt();

        double valorFinal = total;

        if (opcao == 1) {
            valorFinal = total * 0.92;
        } else if (opcao == 2) {
            valorFinal = total * 0.97;
        } else if (opcao == 3) {
            valorFinal = total;
            System.out.println("Valor das parcelas: 2x de R$" + String.format("%.2f", valorFinal / 2));
        } else if (opcao == 4) {
            valorFinal = total * 1.10;
            System.out.print("Digite o número de parcelas (3 a 10): ");
            int parcelas = ler.nextInt();
            if (parcelas >= 3 && parcelas <= 10) {
                System.out.println("Valor das parcelas: " + parcelas + "x de R$" + String.format("%.2f", valorFinal / parcelas));
            } else {
                System.out.println("Número de parcelas inválido. Será cobrado o valor total com 10% de juros.");
            }
        } else {
            System.out.println("Opção inválida. Considerando pagamento sem desconto.");
        }

        System.out.println("\n--- Lista de Produtos ---");
        System.out.println(listaProdutos);
        System.out.println("Valor total da compra: R$" + String.format("%.2f", total));
        System.out.println("Valor a ser pago: R$" + String.format("%.2f", valorFinal));

  
    }
}