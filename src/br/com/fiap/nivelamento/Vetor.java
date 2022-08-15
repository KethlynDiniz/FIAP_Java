//Em um vetor de inteiros de 10 posições fazer as seguintes rotinas:
//
//- Preencher o vetor
//- Exibir o conteúdo do vetor
//- Somar os elementos do vetor
//- Buscar um elemento no vetor


package br.com.fiap.nivelamento;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// Estancia o objeto Teclado para ler variáveis
		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[10];

		// 1 - PREENCHER O VETOR
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite vetor[" + i + "]= ");
			vetor[i] = teclado.nextInt();
		}

		// 2 - EXIBIR O CONTEÚDO DO VETOR
		for (int i = 0; i < 10; i++) {
			System.out.println("vetor[" + i + "]= " + vetor[i]);
		}

		// 3 - SOMAR OS ELEMENTOS DO VETOR
		for (int i = 0; i < 10; i++) {
			System.out.println("vetor[" + i + "]= " + vetor[i]);
		}

		// 4 - BUSCAR UM ELEMENTO NO VETOR
		boolean achou = false;
		int elem;

		// Digitação do elemento que será procurado
		System.out.print("Digite o elemento: ");
		elem = teclado.nextInt();

		for (int i = 0; i < 10; i++) {
			// Caso encontre o elemento, interrompe a busca
			if (vetor[i] == elem) {
				achou = true;
				break;
			}

		}
		// Analisa se encontrou ou não o elemento
		if (achou)
			System.out.println("Elemento " + elem + " encontrado no vetor");
		else
			System.out.println("Elemento " + elem + " NÃO encontrado no vetor");
	}
}
