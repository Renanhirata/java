/******************************************************************************

 A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/
import java.util.Scanner;
public class BonusEx04
{
    public static void main(String[] args) {
        double anos, salario, bonus20, bonus10;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos anos na empresa? : ");
        anos = ler.nextDouble();
        System.out.println("Insira seu salário : ");
        salario = ler.nextDouble();
        
            bonus20 = salario * 0.20;
                bonus10 = salario * 0.10;

        
        if (anos >= 5)
        System.out.println("O seu bônus será: " + bonus20);
        else
        System.out.println("O seu bônus será: " + bonus10);
        
    }
}