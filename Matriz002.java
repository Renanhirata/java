/******************************************************************************

2) Faça um programa que leia uma matriz 3x4 de inteiros,
substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.

*******************************************************************************/
import java.util.Scanner;
public class Matriz002
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    // Criando a Matriz 3x4 vazia
		int[][] matriz = new int[3][4];
		int[][] matrizModificada = new int[3][4];
		
		//Entrada de dados
		System.out.println("Digite os elementos da Matriz 4x4: ");
		for (int i = 0; i < 3; i++){
		    for (int j=0; j < 4; j++){
		        System.out.print("Elemento [" + i +"][" + j + "]: ");
		        matriz[i][j] = ler.nextInt();
		        matrizModificada[i][j] = matriz[i][j];
		    }
		}
		// Se for <0
		for (int i = 0; i < 3; i++){
		    for (int j=0; j < 4; j++){
		        if(matrizModificada[i][j] < 0){
		            matrizModificada[i][j] = 0;
		        }
		    }
		}
		
		// Exibição da matriz Original
		System.out.println("Matriz ORIGINAL 3x4:");
		for (int i = 0; i < 3; i++){
		    for (int j=0; j < 4; j++){
		        System.out.print(matriz[i][j] + " ");
		}
		System.out.println(); // Quebra de linha após cada linha da matriz
		}
		System.out.println("Matriz MODIFICADA 3x4 :");
		for (int i = 0; i < 3; i++){
		    for (int j=0; j < 4; j++){
		        System.out.print(matrizModificada[i][j] + " ");
		}
		System.out.println(); // Quebra de linha após cada linha da matriz
		}
	}
}