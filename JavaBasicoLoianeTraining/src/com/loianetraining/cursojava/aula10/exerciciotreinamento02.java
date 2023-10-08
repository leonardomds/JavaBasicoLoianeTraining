package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exerciciotreinamento02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Iremos fazer uma soma!");
		System.out.print("Informe o primeiro numero: ");
		int primeiroNumero = scan.nextInt();
		System.out.print("Informe o segundo numero: ");
		int segundoNumero = scan.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		
		System.out.print("A soma dos dois numeros é: " + resultado);
		
		
		scan.close();

	}

}
