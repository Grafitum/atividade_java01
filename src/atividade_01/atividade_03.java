package atividade_01;

import java.util.Scanner;



public class atividade_03 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros
		//A, B, C e D. A seguir, calcule e mostre a diferença
		//do produtode A e B pelo produto de C e D segundo a
		//fórmula: DIFERENCA = (A * B - C * D)
		Scanner sc = new Scanner(System.in);
		
		int a, b, c , d;
		System.out.println("Digite o valor 01");
		a = sc.nextInt();
		System.out.println("valor 02");
		b = sc.nextInt();
		System.out.println("valor 3 ");
		c = sc.nextInt();
		System.out.println(" valor 4");
		d = sc.nextInt();
		
		int diferença = a * b - c * d;
		System.out.println(" a diferença é = " +diferença);
		
		

	}

}
