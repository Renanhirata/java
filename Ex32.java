/******************************************************************************

Faça um programa que leia 5 números e informe o maior número.

*******************************************************************************/
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1;
        int numero, maior;

        System.out.print("Digite o 1º número: ");
        numero = ler.nextInt();
        maior = numero;

        while (contador < 5) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero = ler.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número é: " + maior);

        
    }
}