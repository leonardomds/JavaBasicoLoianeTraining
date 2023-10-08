package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class ExericiosTreinamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		
		int numeroInformado = scanner.nextInt();
		System.out.print("O numero informado foi: " + numeroInformado);
		
		
		
		scanner.close();

	}

}
