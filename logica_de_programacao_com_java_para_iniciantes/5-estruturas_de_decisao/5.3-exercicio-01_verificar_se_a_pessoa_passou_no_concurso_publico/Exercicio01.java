import java.util.Scanner;

public class Exercicio01 {

	static final Integer NOTA_MINIMA_PARA_PASSAR = 150;
	static final Integer NOTA_MINIMA_POR_MATERIA = 60;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean calculaNotaPortugues = notaPortugues >= NOTA_MINIMA_POR_MATERIA;
		Boolean calculaNotaMatematica = notaMatematica >= NOTA_MINIMA_POR_MATERIA;
		Boolean calculaNotaTotal = (notaPortugues + notaMatematica) >= NOTA_MINIMA_PARA_PASSAR;
		Boolean verificaCondicoesParaPassar = calculaNotaTotal && (calculaNotaPortugues && calculaNotaMatematica);
				
		if (verificaCondicoesParaPassar) {
			System.out.println("Conseguiu a vaga!!!");
		} else {
			System.out.println("Não conseguiu a vaga.");
		}
		
		scanner.close();
	}
}
