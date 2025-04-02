/******************************************************************************

Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/
import java.util.Scanner;
public class ParEx06
{
    public static void main(String[] args) {
        int n, c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        n = ler.nextInt();
        
        c = n % 2;
        
       if (c == 0)
       System.out.println("Seu número é par!");
       else
       System.out.println("Seu número é ímpar!");
       
    }
}