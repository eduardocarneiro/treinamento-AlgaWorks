import java.util.Scanner;

public class TesteIf2 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		// Este programa compara qual valor é o maior
		System.out.print("Valor1: ");
		double valor1 = entrada.nextDouble();

		System.out.print("Valor2: ");
		double valor2 = entrada.nextDouble();

		if (valor1 > valor2) {
			System.out.println("Valor 1 é maior");
		} else {
			System.out.println("Valor2 é maior");
		}
	}
}
