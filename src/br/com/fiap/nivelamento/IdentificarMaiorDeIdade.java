package br.com.fiap.nivelamento;

import java.util.Scanner;

public class IdentificarMaiorDeIdade {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int idade;
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if (idade >= 18) {
				System.out.println("Maior de Idade");
			} else {
				System.out.println("Menor de Idade");
			}
		}

	}

}
