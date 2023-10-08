package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O " + n1 + " é o maior numero!");
		} else if (n2 > n1) {
			System.out.println("O "+ n2 + " é o maior numero");
		}
		
		scan.close();
	}

}
