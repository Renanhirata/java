/******************************************************************************

Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.

*******************************************************************************/
import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, resultado = "";
        int n = 1;


        while (n <= 5) {
            System.out.println("Insira o nome: ");
            nome = ler.nextLine();
            resultado += nome + "\n";  
            n++;
        }

        System.out.println("Esses são:");
        System.out.println(resultado);
    }
}