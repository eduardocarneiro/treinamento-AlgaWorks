import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cursosDisponiveis = new String[] {"Java Básico", "Spring Suite", "Java OO avançado"};
		
		System.out.println("Curso disponíveis:");
		ImprimirTraco();
		
		for (int i = 0; i < cursosDisponiveis.length; i++) {
			
			System.out.println("[" + i + "] - " + cursosDisponiveis[i]);
		}
		
		ImprimirTraco();
		System.out.println("");
		
		System.out.print("Digite a opção para curso desejado: ");
		Integer cursoEscolhido = scanner.nextInt();
		
		// PAGAMENTO
		
		String[] formaDePagamento = new String[] {"Transferência Bancária", "Boleto", "Cartão de Débito", "Cartão de crédito"};
		
		ImprimirTraco();
		System.out.println("");
				
		System.out.println("Formas de pagamento:");
		ImprimirTraco();
		
		for (int j = 0; j < formaDePagamento.length ; j++) {
			
			System.out.println("[" + j + "] - " + formaDePagamento[j]);
		}
		
		System.out.print("Escolha a opção de pagamento: ");
		Integer opcaoDePagamento = scanner.nextInt();
		
				System.out.println("O curso escolhido foi: " + cursosDisponiveis[cursoEscolhido] + " e a forma de pagamento: " + formaDePagamento[opcaoDePagamento]);
				
		scanner.close();	
	}
	
	static void ImprimirTraco() {
		System.out.println("-----------------------");
	}
}
