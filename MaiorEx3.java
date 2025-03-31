/******************************************************************************

Faça um algoritmo que receba três números inteiros e mostre o maior deles

*******************************************************************************/
import java.util.Scanner;
public class MaiorEx3
{
    public static void main(String[] args) {
     int n1, n2, n3;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digite 1 número: ");
     n1 = ler.nextInt();
     System.out.println("Digite 2 número: ");
     n2 = ler.nextInt();
     System.out.println("Digite a 3 número: ");
     n3 = ler.nextInt();
    
     if(n1>n2 && n1>n3)
     System.out.println("O maior número será: " + n1);
     else if (n2> n1 && n2>n3)
     System.out.println("O maior número será: " + n2 );
     else if(n3>n1 && n3>n2)
     System.out.println("O maior número será: " + n3);
    }
}