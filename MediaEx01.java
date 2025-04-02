/******************************************************************************
 
Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.


*******************************************************************************/
import java.util.Scanner; 
public class MediaEx01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, soma, media;
        
        System.out.print("Informe primeira nota: ");
        n1 = ler.nextInt();
        System.out.print("Informe segunda nota: ");
        n2 = ler.nextInt();
      
        soma = n1 + n2;
        media = soma / 2;
        
        if (media >= 7)
        System.out.println("APROVADO!");
        else
        System.out.println("REPROVADO!");
        
        
        
    }   
}