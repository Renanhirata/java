/******************************************************************************

 Faça um algoritmo que receba um número inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/
import java.util.Scanner;
public class ParEx05
{
    public static void main(String[] args) {
    int n1, n2, par;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Insira o número: ");
     n1 = ler.nextInt();

    par = n1%2;
    
    if (par==0)
       System.out.println("Seu número será par");
    else 
     System.out.println("Seu número será impar");
    }
}