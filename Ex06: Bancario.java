/******************************************************************************

Implemente um código para aprovarempréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

*******************************************************************************/
import java.util.Scanner;
public class BancarioEx06
{
    public static void main(String[] args) {
    double valor, salario, max, emprestim, parcela;
     Scanner ler = new Scanner(System.in);

    
    System.out.println("Insira o salario atual: ");
    salario = ler.nextDouble();
    System.out.println("Insira o valor do empréstimo: ");
    emprestim = ler.nextDouble();
    System.out.println("Insira o número de parcelas: ");
    parcela = ler.nextDouble();
        
    valor = emprestim/parcela;
    max = salario*0.30;
    
    if (valor<=max) {
    System.out.println("Empréstimo aceito!");
    }
    else
    {
    System.out.println("Empréstimo Recusado!");
    }
    }
}
