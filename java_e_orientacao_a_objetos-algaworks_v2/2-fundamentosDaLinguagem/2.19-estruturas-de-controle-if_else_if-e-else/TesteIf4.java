import java.util.Scanner;

public class TesteIf4 {

	public static void main (String[] args) {
	
		// Este programa vai calcular a média de um aluno
		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota1: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Nota2: ");
		double nota2 = entrada.nextDouble();

		System.out.print("Nota3: ");
		double nota3 = entrada.nextDouble();

		System.out.print("Nota4: ");
		double nota4 = entrada.nextDouble();
		
		// Calcula a media
		double totalNota = (nota1 + nota2 + nota3 + nota4) / 4;


		if ( totalNota <= 5 ) {
			System.out.println("O Aluno não passou de ano e sua média anual foi: " + totalNota);

		} else if (totalNota <= 6.9) {
			System.out.println("O Aluno ficou de recuperação e sua média anual foi: " + totalNota);

		} else {
			System.out.println("O Aluno passou de ano e sua média anual foi: " + totalNota);
		}
	}
}
