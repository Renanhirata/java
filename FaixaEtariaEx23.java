/******************************************************************************

Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. 
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.

*******************************************************************************/
import java.util.Scanner;

public class FaixaEtariaEx23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        double media = 0, mediam1_10 = 0, mediam11_20 = 0, mediam21_30 = 0, mediamMaior31 = 0;
        int cont1_10 = 0, cont11_20 = 0, cont21_30 = 0, contMaior31 = 0;
        int somaPeso1_10 = 0, somaPeso11_20 = 0, somaPeso21_30 = 0, somaPesoMaior31 = 0;
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe a idade da pessoa " + (i+1) + ": ");
            idade = scanner.nextInt();
            
            System.out.println("Informe o peso da pessoa " + (i+1) + ": ");
            int peso = scanner.nextInt();
            
            if (idade >= 1 && idade <= 10) {
                somaPeso1_10 += peso;
                cont1_10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11_20 += peso;
                cont11_20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21_30 += peso;
                cont21_30++;
            } else if (idade > 30) {
                somaPesoMaior31 += peso;
                contMaior31++;
            }

            media += peso;
        }

        if (cont1_10 > 0) {
            mediam1_10 = (double) somaPeso1_10 / cont1_10;
        }

        if (cont11_20 > 0) {
            mediam11_20 = (double) somaPeso11_20 / cont11_20;
        }

        if (cont21_30 > 0) {
            mediam21_30 = (double) somaPeso21_30 / cont21_30;
        }

        if (contMaior31 > 0) {
            mediamMaior31 = (double) somaPesoMaior31 / contMaior31;
        }

        media = media / 15;

        System.out.println("A média de peso do grupo é: " + media);
        System.out.println("A média de peso para a faixa etária de 1 a 10 anos é: " + mediam1_10);
        System.out.println("A média de peso para a faixa etária de 11 a 20 anos é: " + mediam11_20);
        System.out.println("A média de peso para a faixa etária de 21 a 30 anos é: " + mediam21_30);
        System.out.println("A média de peso para a faixa etária maior de 31 anos é: " + mediamMaior31);
    }
}