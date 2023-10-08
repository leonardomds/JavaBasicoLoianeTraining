package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a nota da primeira prova: ");
		int nota1 = scan.nextInt();
		
		System.out.print("Informe a nota da segunda prova: ");
		int nota2 = scan.nextInt();
		
		int media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção! Sua média foi: " + media);
		} else if (media < 7) {
			System.out.println("Reprovado! Sua média foi: " + media);
		} else if (media > 7) {
			System.out.println("Aprovado! Sua média foi: "+ media);
		}
		scan.close();
	}

}
