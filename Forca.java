/******************************************************************************

1) Desenvolver o jogo da Forca. Favor seguir algumas regras:
    a) Pedir para o jogador 1 digitar a palavra que será adivinhada pelo jogador 2
    b) Digitar o nome do jogador 2 para iniciar o jogo.
    c) A cada letra digitada mostrar a letra certa / 
    errada e um desenho mostrando a perda de uma parte do corpo, se a letra estiver errada.
    d) O jogador 2 terá 5 tentativas de adivinhar a palavra correta.
    e) Se o jogo finalizar, mostrar o nome do jogador 2 e se ele ganhou ou perdeu.
*******************************************************************************/
import java.util.Scanner;
public class Forca
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra, nome, letra;
        int tentativas = 0;
        boolean ganhou = false;

        System.out.println("Insira a palavra que será utilizada na forca: ");
        palavra = ler.nextLine().toLowerCase();

        System.out.println("Insira o nome do Jogador: ");
        nome = ler.nextLine();

        String palavraOculta = "";
        for (int i = 0; i < palavra.length(); i++) {
            palavraOculta += "_";
        }

        System.out.println("\n============= JOGO DA FORCA =============");

        while (tentativas < 5 && !ganhou) {
            System.out.println("\nPalavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + (5 - tentativas));
            mostrarDesenho(tentativas); // Desenha o boneco atual
            System.out.print("Insira uma letra: ");
            letra = ler.nextLine().toLowerCase();

            boolean acertou = false;
            String novaPalavraOculta = "";

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    novaPalavraOculta += letra.charAt(0);
                    acertou = true;
                } else {
                    novaPalavraOculta += palavraOculta.charAt(i);
                }
            }

            if (acertou) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou!");
                tentativas++;
            }

            palavraOculta = novaPalavraOculta;

            if (palavraOculta.equals(palavra)) {
                ganhou = true;
            }
        }

        if (ganhou) {
            System.out.println("\nParabéns " + nome + "! Você acertou a palavra: " + palavra);
        } else {
            System.out.println("\nFim de jogo, " + nome + ". A palavra era: " + palavra);
            mostrarDesenho(5); // Desenha boneco completo (game over)
            System.out.println("!!!! GAME OVER !!!");
        }

        ler.close();
    }

    private static void mostrarDesenho(int erros) {
        System.out.println("                _____");
        System.out.println("                |   |");

        if (erros >= 1)
            System.out.println("                |  (ツ)");
        else
            System.out.println("                |");

        if (erros == 2)
            System.out.println("                |   |");
        else if (erros == 3)
            System.out.println("                |  /|");
        else if (erros >= 4)
            System.out.println("                |  /|\\");
        else
            System.out.println("                |");

        if (erros == 5)
            System.out.println("                |  /'\\");
        else
            System.out.println("                |");

        System.out.println("                |");
        System.out.println("             __|__");
    }
}