/******************************************************************************

Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

*******************************************************************************/
import java.util.Scanner;
public class BancarioEx05
{
    public static void main(String[] args) {
        double valor, parcelas, salario, limite, max;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor do empréstimo: ");
        valor = ler.nextDouble();
        System.out.println("Insira seu parcelas : ");
        parcelas = ler.nextDouble();
        System.out.println("Insira seu salário : ");
        salario = ler.nextDouble();

        limite = valor/parcelas;
        max = salario * 0.30;



        if (limite <= max)
        System.out.println("APROVADO!");
        else
        System.out.println("NEGADO!");

    }
}