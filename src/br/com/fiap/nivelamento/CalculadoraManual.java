

//Dado 2 números inteiros e uma operação aritmética desejada, calcule a resposta adequada: Utilize os símbolos a seguir para ler qual a operação escolhida:
// (+) Soma
//
// (-) Subtração  
//
// (*) Multiplicação 
// 
// (/) Divisão



package br.com.fiap.nivelamento;

import java.util.Scanner;

public class CalculadoraManual {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			float numero1, numero2, resultado;
			String operador;
			
			System.out.println("Digite um valor: ");
			numero1 = entrada.nextFloat();
			System.out.println("Digite outro valor: ");
			numero2 = entrada.nextFloat();
			System.out.println("Digite a operação desejada: ");
			operador = entrada.next();
			
			switch(operador) {
			
			case "+":
				resultado = numero1 + numero2;
				System.out.println("A Soma é: " + resultado); break;
				
			case "-":
				resultado = numero1 - numero2;
				System.out.println("A Subtração é: " + resultado); break;
				
			case "*":
				resultado = numero1 * numero2;
				System.out.println("A Multiplicação é: " + resultado); break;
				
			case "/":
				if(numero2 == 0) {
					System.out.println("Não existi divisão por zero.");
				}else {
				resultado = numero1 / numero2;
				System.out.println("A Divisão é: " + resultado);}
				break;
				
			default:
				System.out.println("Operador inválido");
			
			}
		}

	}

}
