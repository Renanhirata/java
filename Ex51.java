/******************************************************************************

Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. 
Calcule o valor final com juros compostos de 2% ao mês. 
Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.

*******************************************************************************/
import java.util.Scanner;

public class Ex51 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emp, parcelas;
        double juros, total, tparc;
        System.out.println("Insira o valor do empréstimo: ");
        emp = scanner.nextInt();
        System.out.println("Insira a quantidade de parcelas: ");
        parcelas = scanner.nextInt();
        juros = emp * 0.02;
        total = emp + juros;
        tparc = total / parcelas;
        System.out.println("Valor do empréstimo: " +emp);
        System.out.println("Valor do juros: " +juros);
        System.out.println("Valor do total: " +total);
         System.out.println("Valor das parcelas: " +tparc);
        
    }
}