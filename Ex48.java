/******************************************************************************

Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100). 
O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar. 
A cada erro, o programa dá dicas: "maior" ou "menor".

*******************************************************************************/


import java.util.Scanner;
import java.util.Random;
public class Ex48 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         Random rand = new Random();
        int max = 0, tentativa, dificuldade;

        System.out.println("=== ESCOLHA A DIFICULDADE ===");
        System.out.println("1) Fácil - 1 a 10");
        System.out.println("2) Médio - 1 a 50");
        System.out.println("3) Difícil - 1 a 100");
        
        dificuldade = ler.nextInt();
        
        if (dificuldade == 1) {
            max = 10;
        } else if (dificuldade == 2) {
            max = 50;
        } else if (dificuldade == 3) {
            max = 100;
        } else {
            System.out.println("Dificuldade inválida. O programa será encerrado.");
            return;  
        }
                int numeroAleatorio = rand.nextInt(max) + 1;
        
        System.out.println("Você tem 5 tentativas para adivinhar o número!");

        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Tentativa " + i + ": Digite um número: ");
            tentativa = ler.nextInt(); 
            
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                return; 
            } else {
                System.out.println(tentativa < numeroAleatorio ? "O número é maior." : "O número é menor.");
            }
        }
        System.out.println("Você não acertou o número. O número era " + numeroAleatorio);
    }
}