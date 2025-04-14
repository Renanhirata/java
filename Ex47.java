/******************************************************************************

Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0.
O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor.
Empates devem ser considerados.

*******************************************************************************/
import java.util.Scanner;
public class Ex47 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int votos1 = 0, votos2 = 0, votos3 = 0, voto;

        System.out.println("Eleição - Candidatos:");
        System.out.println("1) Candidato 01");
        System.out.println("2) Candidato 02");
        System.out.println("3) Candidato 03");
        System.out.println("Digite 0 para encerrar a votação.\n");
        
        while (true) {
            System.out.println("Digite seu voto (1, 2, 3 ou 0 para sair): ");
            
            voto = ler.nextInt(); 

            if (voto == 0) {
                break;  
            } else if (voto == 1) {
                votos1++; 
            } else if (voto == 2) {
                votos2++;  
            } else if (voto == 3) {
                votos3++; 
            } else {
                System.out.println("Voto inválido! Tente novamente.");
            }
            }
             System.out.println("\nResultado da eleição:" );
             System.out.println("Candidato 01: " + votos1 + " voto(s)");
             System.out.println("Candidato 02: " + votos2 + " voto(s)");
             System.out.println("Candidato 03: " + votos3 + " voto(s)");
             
               if (votos1 > votos2 && votos1 > votos3) {
            System.out.println("Candidato 01 é o vencedor!");
        } else if (votos2 > votos1 && votos2 > votos3) {
            System.out.println("Candidato 02 é o vencedor!");
        } else if (votos3 > votos1 && votos3 > votos2) {
            System.out.println("Candidato 03 é o vencedor!");
        } else {
            System.out.println("Houve empate entre os candidatos.");
        }

          
        }
    }