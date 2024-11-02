package atividade_01;
import java.util.*;

public class atividade_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		// fazer um programa para ler o código de uma peça 1, 
		//o número de peças 1, 
		//o valor unitário de cada peça 1, o
		//código de uma peça 2, 
		//o número de peças 2 e o valor unitário de cada peça 2.
		//Calcule e mostre o valor a ser pago

		int  n1, v1, n2, v2;
		double p1, p2;
		
		p1 = sc.nextDouble()
;		
		n1 = sc.nextInt()
;
		v1 = sc.nextInt()
;
		p2 = sc.nextDouble()
;
		n2 = sc.nextInt()
;
		v2 = sc.nextInt()
;
		
		double valor = n1 * v1 + n2 * v2;
		
		System.out.printf("Valor é = R$ %.2f%n",valor);
		
		sc.close();
		
	}

}
