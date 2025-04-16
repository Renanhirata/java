/******************************************************************************

 Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, calcule e apresente a soma das idades. 
 Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".


*******************************************************************************/
import java.util.Scanner;
public class Ex52_ 
{

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
            soma = soma + idades[i];
        }

        System.out.println("\nClassificação das pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            if (idades[i] < 18) {
                System.out.println("Criança");
            } else if (idades[i] < 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Melhor idade");
            }
        }

        System.out.println("\nSoma das idades: " + soma);
    }
}