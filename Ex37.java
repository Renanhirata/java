/******************************************************************************

37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
  * 
*******************************************************************************/
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      int cavalos, ferraduras;
      
      System.out.println("Insira a quantidade de cavalos: ");
      cavalos = ler.nextInt();
      ferraduras = cavalos * 4;
      System.out.println("Será necessário " +ferraduras+ " ferraduras:");
    }
}
    
     