/******************************************************************************

Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 

*******************************************************************************/
import java.util.Scanner;

public class GrupoEx22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        double media = 0, mediam = 0, mediaf = 0;
        int contM = 0, contF = 0;  
        int somaM = 0, somaF = 0;
        char sexo;

        for (int i = 0; i < 7; i++) {
            System.out.println("Insira seu sexo: M = Masculino / F = Feminino ");
            sexo = scanner.nextLine().charAt(0);

            System.out.println("Insira sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            if (sexo == 'M') {
                somaM += idade;
                contM++;
            } else if (sexo == 'F') {
                somaF += idade;
                contF++;
            }

            media += idade;
        }

        if (contM > 0) {
            mediam = (double) somaM / contM;
        }

        if (contF > 0) {
            mediaf = (double) somaF / contF;
        }

        media = media / 7;

        System.out.println("A média do grupo é: " + media);
        System.out.println("A média masculina é: " + mediam);
        System.out.println("A média feminina é: " + mediaf);
    }
}