package br.com.fiap.nivelamento;

import java.util.Scanner;

public class ModuloMatematico {
		public static void main(String[] args) {
			try (Scanner entrada = new Scanner(System.in)) {
				int n;
				System.out.println("Digite um número:");
				n = entrada.nextInt();
				// Decisão simples: Verifica se o número é negativo
				if (n < 0)
				 { // Se verdade executa este bloco
					   n = n * -1;
				}
				//Exibe	o número positivo
				System.out.println("Módulo: " + n);
			}
		}
	}

