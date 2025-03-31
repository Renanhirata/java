/******************************************************************************

Receba a idade do usuário e verifique se ele tem 18 anos ou mais.

*******************************************************************************/
import java.util.Scanner;
public class Maior
{
    public static void main(String[] args) {
     int idade;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digite idade: ");
     idade = ler.nextInt();
   
     if(idade>=18 )
      System.out.println("Você é de maior idade ");
     else
      System.out.println("Você é de menor idade ");
    }
}