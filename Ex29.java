/******************************************************************************

Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.

*******************************************************************************/
import java.util.Scanner;
public class Ex29
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aluno, contador = 1;
        double peso, somap = 0, media;

        System.out.println("Quantos alunos existe na academia?");
            aluno = ler.nextInt();

            while (contador <= aluno) {
            System.out.println("Insira o peso do " + contador + " ° aluno : ");
            peso = ler.nextDouble();
            somap += peso;
            contador++;
            } 
            media = somap / aluno;
            System.out.println(media);


    }
}