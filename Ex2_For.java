/******************************************************************************

Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. 
Utilize for.

*******************************************************************************/
public class Ex2_For
{
	public static void main(String[] args) {
		System.out.println("Os número pares de 1 a 50 são: ");
		for(int par = 1; par <=50; par++) {
		    if(par % 2 == 0){
		    System.out.println(par);
		    }
		}
		System.out.println("Os número impares de 51 a 100 são: ");
		for(int impar = 51; impar <=100; impar++) {
		if(impar % 2 != 0){
		System.out.println(impar);
		}
		}
	}
}
