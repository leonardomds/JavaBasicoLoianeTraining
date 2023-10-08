package com.loianetraining.cursojava.aula10;

import java.util.Scanner;

public class exerciciotreinamento03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira as notas dos quatro bimestres
        System.out.println("Informe a nota do 1º bimestre:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Informe a nota do 2º bimestre:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Informe a nota do 3º bimestre:");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Informe a nota do 4º bimestre:");
        double nota4 = scanner.nextDouble();
        
        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        // Exibe a média
        System.out.println("A média das notas é: " + media);
        
        // Fecha o scanner
        scanner.close();

	}

}
