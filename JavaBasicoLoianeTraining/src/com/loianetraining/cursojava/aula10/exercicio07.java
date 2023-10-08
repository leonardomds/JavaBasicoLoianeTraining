package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.print("O " + numero1 + " é o maior numero.");
		} else if (numero2 > numero1) {
			System.out.print("O "+ numero2 + " é o maior numero");
		}
		scan.close();

	}

}
