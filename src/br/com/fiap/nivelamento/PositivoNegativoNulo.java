//Dado um número pelo usuário, informar se ele é positivo, negativo ou nulo.

package br.com.fiap.nivelamento;

import java.util.Scanner;

public class PositivoNegativoNulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n;
		System.out.println("Digite um número:");
		n = entrada.nextInt();
		if (n > 0)
			System.out.println("Positivo");
		else if (n < 0)
			System.out.println("Negativo");
		else
			System.out.println("Nulo");
	}
}
