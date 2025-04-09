/******************************************************************************

Faça um programa que leia 10 números e informe a soma e a média dos números.

*******************************************************************************/
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1;
        double numero, soma = 0, media;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = ler.nextDouble();
            soma += numero;
            contador++;
        }

        media = soma / 10;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}