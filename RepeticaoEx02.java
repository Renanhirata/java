/******************************************************************************

*******************************************************************************/
import java.util.Scanner;
public class RepeticaoEx02
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n;
	
	System.out.print("Insira a tabuada: ");
	n= ler.nextInt();
	
    for(int i=1; i <=10  ; i++)
	System.out.println(n + "*" + i + "=" + n*i);
	
    
	}
}