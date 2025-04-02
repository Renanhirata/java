/******************************************************************************

Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

*******************************************************************************/
import java.util.Scanner;
public class Ex16Nome
{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    String nome;
    
    System.out.print("Insira o nome: ");
    nome = ler.nextLine();
    
    for(int i=1; i <=10  ; i++){
    System.out.println("Nome exibido:" +nome);
    }
}
}