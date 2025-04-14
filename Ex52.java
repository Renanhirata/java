/******************************************************************************

 Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Ex52 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.println("Insira o valor de A: ");
        a = scanner.nextDouble();
        
        System.out.println("Insira o valor de B: ");
        b = scanner.nextDouble();
        
        System.out.println("Insira o valor de C: ");
        c = scanner.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        System.out.println("Valor de delta (Δ): " + delta);
        
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("Raiz x1: " + x1);
            System.out.println("Raiz x2: " + x2);
        }
        
    }
}