/******************************************************************************

3. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.

*******************************************************************************/
import java.util.Scanner;
public class MatrizEx003 
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[6][3];
        int maior, menor;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        maior = matriz[0][0];
        menor = matriz[0][0];

        System.out.println("\nMatriz 6x3:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                
                 if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            
            }
            System.out.println();
        }
        System.out.println("\nO maior número é: " + maior);
        System.out.println("O maior número é: " + menor);

        }
    }