/******************************************************************************

1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada

*******************************************************************************/
import java.util.Scanner;
public class Matriz001
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    // Criando a Matriz 4x4 vazia
		int[][] matriz = new int[4][4];
		
		//Entrada de dados
		System.out.println("Digite os elementos da Matriz 4x4: ");
		for (int i = 0; i < 4; i++){
		    for (int j=0; j < 4; j++){
		        System.out.print("Elemento [" + i +"][" + j + "]: ");
		        matriz[i][j] = ler.nextInt();
		    }
		}
		
		// Exibição da matriz
		System.out.println("Matriz 4x4:");
		for (int i = 0; i < 4; i++){
		    for (int j=0; j < 4; j++){
		        System.out.print(matriz[i][j] + " ");
		}
		System.out.println(); // Quebra de linha após cada linha da matriz
		}
	}
}