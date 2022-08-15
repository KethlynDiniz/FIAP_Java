//Dada a parte numérica da placa de um automóvel, fazer um algoritmo que exiba o dia do rodízio. 
//Considere a regra de São Paulo. Para veículos com final da placa:
//
//- 1 e 2 - rodízio é segunda-feira
//- 3 e 4 - rodízio é terça-feira
//- 5 e 6 - rodízio é quarta-feira
//- 7 e 8 - rodízio é quinta-feira
//- 9 e 0 - rodízio é sexta-feira



package br.com.fiap.nivelamento;

import java.util.Scanner;

public class RodizioVeiculos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroPlaca, finalPlaca;
		System.out.println("Digite o número da placa:");
		numeroPlaca = entrada.nextInt();
		finalPlaca = numeroPlaca % 10;
		switch (finalPlaca) {
		case 1:
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("Quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("Quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("Sexta-feira");
			break;
		}
	}
}
