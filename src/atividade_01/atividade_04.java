package atividade_01;

import java.util.Locale;
import java.util.Scanner;

public class atividade_04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário,
		//seu número de horas trabalhadas, o valor que recebe por
		
		//hora e calcula o salário desse funcionário.
		//A seguir, mostre o número e o salário do funcionário,
		//com duas casas
		//decimais
		
		Scanner ler =  new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num;
		double sal;
		double ht;
		
	double v_h;
		
		 num = ler.nextInt();
		 
		 ht = ler.nextDouble();
		 
		 
		 v_h = ler.nextDouble();
		 
		 sal = ht * v_h;
		 
		 System.out.println("o funcionário de número " +num);
		 System.out.printf(" O salario do funcionário é : U$ %.2f%n" , sal);
		 
		 ler.close();

		

	}

}
