/******************************************************************************

Média final da disciplina 

*******************************************************************************/
import java.util.Scanner;
public class Media
{
    public static void main(String[] args) {
     double a, b, soma, media;
     Scanner ler = new Scanner(System.in);
    

     System.out.println("Digite a primeira nota: ");
     a = ler.nextDouble();
     System.out.println("Digite a segunda nota: ");
     b = ler.nextDouble();

     soma = a + b;
     media = soma/2;
     
     if(media>=7)
       System.out.println("APROVADO!");
     else
     System.out.println("REPROVADO!");
     ;
	}
}
