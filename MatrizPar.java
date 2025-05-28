/******************************************************************************

1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.

*******************************************************************************/
import java.util.Scanner;
public class MarizPar
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int par = 0;

        System.out.println("Digite os elementos da Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    par++;
                }
            }
        }

        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nQuantidade de números pares na matriz: " + par);
    }
}