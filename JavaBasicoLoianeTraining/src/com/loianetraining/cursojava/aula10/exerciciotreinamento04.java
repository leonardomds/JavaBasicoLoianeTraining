package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exerciciotreinamento04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		int horaTrabalhada = scan.nextInt();
		
		System.out.print("Informe quantas horas você trabalha por mês: ");
		int horaMes = scan.nextInt();
		
		int resultado = horaTrabalhada * horaMes;
		
		System.out.print("O seu salário mensal é de " + resultado);
		
		
		scan.close();
	}

}
