package com.loianetraining.cursojava.aula10;

// FAÇA UM PROGRAMA QUE IMPRIMA F PARA FEMININO, M PARA MASCULINO E SEXO INVALIDO PARA OUTRA LETRA SEM SER F OU M.

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu sexo");
		System.out.print("Entre com a letra (F ou M) para Feminino ou Masculino: ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")){
			System.out.println("Você escolher F, seu sexo está definido Feminino!");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Você escolheu M, seu sexo está definido como Masculino!");
		} else {
			System.out.println("Sexo inválido!");
		}
			
		
		scan.close();
	}

}
