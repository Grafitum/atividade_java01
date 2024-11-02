package atividade_01;

import java.util.Locale;
import java.util.Scanner;



public class atividade_02 {

	public static void main(String[] args) {
		//calculando a area , com pi = 3.14159
		Scanner scanner = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double area;	double raio; double pi = 3.14159;
		
		System.out.printf("Digite o raio");
		raio = scanner.nextDouble();
				
		area = pi * Math.pow(raio, 2);
	
		
		System.out.printf("a area é = %.4f%n", area);
		
		scanner.close();
	
		
		
	
	
	
	

	}

}
