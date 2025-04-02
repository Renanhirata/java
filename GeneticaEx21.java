/******************************************************************************

Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 

*******************************************************************************/
import java.util.Scanner;

public class GeneticaEx21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPessoas = 5;
        int contIdadeSuperior50PesoInferior60 = 0;
        int somaIdadesAlturaInferior150 = 0;
        int contAlturaInferior150 = 0;
        int contOlhosAzuis = 0;
        int contPessoasRuivasSemOlhosAzuis = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            char corOlhos = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Cor dos cabelos (P - Preto, C - Castanho, L - Loiro, R - Ruivo): ");
            char corCabelos = scanner.next().toUpperCase().charAt(0);
            
           
            if (idade > 50 && peso < 60) {
                contIdadeSuperior50PesoInferior60++;
            }
            
           
            if (altura < 1.50) {
                somaIdadesAlturaInferior150 += idade;
                contAlturaInferior150++;
            }
            
            
            if (corOlhos == 'A') {
                contOlhosAzuis++;
            }
            
            
            if (corCabelos == 'R' && corOlhos != 'A') {
                contPessoasRuivasSemOlhosAzuis++;
            }
        }

        
        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + contIdadeSuperior50PesoInferior60);
        
        if (contAlturaInferior150 > 0) {
            double mediaIdades = (double) somaIdadesAlturaInferior150 / contAlturaInferior150;
            System.out.printf("Média das idades das pessoas com altura inferior a 1,50: %.2f\n", mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa com altura inferior a 1,50 foi registrada.");
        }
        
        double porcentagemOlhosAzuis = (double) contOlhosAzuis / totalPessoas * 100;
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + contPessoasRuivasSemOlhosAzuis);
        
        scanner.close();
    }
}