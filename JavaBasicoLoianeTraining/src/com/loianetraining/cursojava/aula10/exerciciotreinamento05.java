package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exerciciotreinamento05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		Double horaTrabalhada = scan.nextDouble();
		
		System.out.print("Informe quantas horas você trabalha por mês: ");
		Double horaMes = scan.nextDouble();
		
		Double resultado = horaTrabalhada * horaMes;
		
		System.out.println();
		System.out.println("O total do seu salário bruto mensal é: " + resultado);
		
		System.out.println();
		System.out.println("Abaixo informaremos os descontos e o valor total com os descontos");
		
		Double descontoIR = 11.0;
		Double descontoInss = 8.0;
		Double descontoSindicato = 5.0;
		
		Double valorDescontoIR = (descontoIR / 100) * resultado;
		Double valorDescontoInss = (descontoInss / 100) * resultado;
		Double valorDescontoSindicato = (descontoSindicato / 100) * resultado;
		System.out.println();
		System.out.println("Sera descontado " + valorDescontoIR + " do salário referente Imposto de Renda");
		
		System.out.println();
		System.out.println("Sera descontado " + valorDescontoInss + " do salário referente a INSS");
		
		System.out.println();
		System.out.println("Sera descontado " + valorDescontoSindicato + " do salário referente ao Sindicato");
		
		System.out.println();
		Double totalDescontado = resultado - valorDescontoInss - valorDescontoIR - valorDescontoSindicato;
		
		System.out.print("O salário com os descontos é de " + totalDescontado);
		
		scan.close();
	}

}
