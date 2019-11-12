import java.util.Scanner;

public class EstruturaWhile2 {

	public static void main(String[] args) {
	
		// Este programa ira receber 2 valor.
		// Irá verificar qual é o menor e maior valor para assim, imprimir os numeros entre os dois valores
		Scanner entrada = new Scanner(System.in);

		System.out.print("Valor1: ");
		int valor1 = entrada.nextInt();

		System.out.print("Valor2: ");
		int valor2 = entrada.nextInt();

		int valorInicial = 0;
		int valorFinal = 0;

		// calor de maior e menor valor
		if (valor1 < valor2)  {
			valorInicial = valor1;
			valorFinal = valor2;

		} else {
			valorInicial = valor2;
		 	valorFinal = valor1;
		}

		int valorAtual = valorInicial;

		/*
		System.out.println(valorInicial);
		System.out.println(valorAtual);
		System.out.println(valorFinal);
		*/

		while (valorAtual <= valorFinal) {
			System.out.println(valorAtual);
			valorAtual++;
		}
		

	}
}
