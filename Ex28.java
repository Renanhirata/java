/******************************************************************************

Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.

*******************************************************************************/
import java.util.Scanner;
public class Ex28
{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    double n1 , n2, soma;
    char resposta = 's';

    while (resposta == 's') {
    System.out.println("Insira um número: ");
    n1 = ler.nextDouble();
    System.out.println("Insira um número: ");
    n2 = ler.nextDouble();

    soma = n1 + n2;


        System.out.println(soma);
        System.out.print("Deseja continuar? (s/n): ");
            ler.nextLine();
            resposta = ler.nextLine().charAt(0);
    }


    }
}