package atividade_01;

import java.util.Scanner;

public class atividade_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n1; int n2;
		
		
		System.out.print("digite o primeiro numero");
		n1 = scanner.nextInt();
		
		
		System.out.println(" e o segundo");
		n2 = scanner.nextInt();
		
		int resultado = n1 + n2;
		
		System.out.println(" O resultado é =" +resultado);
		
		scanner.close();
	}

}
