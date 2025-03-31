/******************************************************************************
 
A empresa XKW concedeu um bônus de 20% do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais.

*******************************************************************************/
import java.util.Scanner;
public class BonusEx04
{
    public static void main(String[] args) {
     double salario, bonus, salario2, bonus2, salario3;
     int tempo;
     Scanner ler = new Scanner(System.in);
     
      System.out.println("Digite o tempo na empresa: ");
     tempo = ler.nextInt();
     System.out.println("Digite o salário atual: ");
     salario = ler.nextDouble();
     
     bonus = salario *0.20;
     bonus2 = salario * 0.10;

     
     if (tempo >= 5) 
     System.out.println("Seu bônus será de " + bonus); 
     else
     System.out.println("Seu bônus será de " + bonus2);
    }
}
