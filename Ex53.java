/******************************************************************************

Desenvolver um programa para ler o nome de 5 pessoas. Guardar esses dadosde array.
Apresentar o nome e a idade das pessoas maiores de idade.

*******************************************************************************/
import java.util.Scanner;
public class Ex53
{
    
    public static void main(String[] args) {
        String[] nomes = new String[5];
        int[] idades = new int[5];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° nome: ");
            nomes[i] = ler.nextLine();
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade de " + nomes[i] + ":");
            idades[i] = ler.nextInt();
        }

        System.out.println("\nPessoas maiores de idade:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println(nomes[i] + " - " + idades[i] + " anos");
            }
        }
    }
}