/******************************************************************************

3) Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.

*******************************************************************************/
import java.util.Scanner;
public class Matriz003
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] numeros = new int[25]; // Para armazenar os números
        int contador = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
        System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
        matriz[i][j] = ler.nextInt();
        numeros[contador] = matriz[i][j];
        contador++;
            }
        }

 
        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
        }

      
        System.out.println("\nElementos repetidos:");
        for (int i = 0; i < numeros.length; i++) {
        for (int j = i + 1; j < numeros.length; j++) {
        if (numeros[i] == numeros[j]) {
        System.out.print(numeros[i] + " ");
        break; 
                }
            }
        }

        ler.close();
    }
}
