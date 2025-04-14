/******************************************************************************

Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:
Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.

*******************************************************************************/
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota, somaNotas = 0;
        int contadorNotas = 0;
        int countExcelente = 0, countBom = 0, countRegular = 0, countInsuficiente = 0;

        System.out.println("Bem-vindo ao cadastro de notas!");
        System.out.println("Digite as notas (entre 0 e 10). Para terminar, digite -1.");

        while (true) {
            System.out.print("Digite uma nota: ");
            nota = ler.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            } else {
                
                if (nota >= 9) {
                    countExcelente++;
                } else if (nota >= 7) {
                    countBom++;
                } else if (nota >= 5) {
                    countRegular++;
                } else {
                    countInsuficiente++;
                }

                somaNotas += nota; 
                contadorNotas++; 
            }
                        if (contadorNotas > 0) {
            double media = somaNotas / contadorNotas;
            System.out.println(" *(Média geral)* : " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        System.out.println("===Classificações===");
        System.out.println("Excelente : " + countExcelente);
        System.out.println("Bom : " + countBom);
        System.out.println("Regular : " + countRegular);
        System.out.println("Insuficiente : " + countInsuficiente);
    }
}
}
        
    