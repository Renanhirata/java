/******************************************************************************

 Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o 
programa informa quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. 
Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.


*******************************************************************************/
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saque, c100 = 100, c50 = 100, c20 = 100, c10 = 100, c5 = 100;
        int qntC100 = 0, qntC50 = 0, qntC20 = 0, qntC10 = 0, qntC5 = 0;

        System.out.print("Informe o valor do saque: R$ ");
        saque = scanner.nextInt();

        if (saque % 5 != 0) {
            System.out.println("Erro: O valor do saque deve ser múltiplo de 5.");
            return;
        }

        if (saque >= 100) {
            qntC100 = saque / 100;
            saque %= 100;
        }

        if (saque >= 50) {
            qntC50 = saque / 50;
            saque %= 50;
        }

        if (saque >= 20) {
            qntC20 = saque / 20;
            saque %= 20;
        }

        if (saque >= 10) {
            qntC10 = saque / 10;
            saque %= 10;
        }

        if (saque >= 5) {
            qntC5 = saque / 5;
            saque %= 5;
        }

        if (saque > 0) {
            System.out.println("Erro: Não é possível realizar o saque com as cédulas disponíveis.");
        } else {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Cédulas de R$100: " + qntC100);
            System.out.println("Cédulas de R$50: " + qntC50);
            System.out.println("Cédulas de R$20: " + qntC20);
            System.out.println("Cédulas de R$10: " + qntC10);
            System.out.println("Cédulas de R$5: " + qntC5);
        }

    }
}