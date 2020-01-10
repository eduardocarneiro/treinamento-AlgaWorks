import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cursosDisponiveis = new String[] {"Java Básico", "Spring Suite", "Java OO avançado"};
		
		String descricaoCursosDisponiveis = "Curso disponíveis:";
		ImprimirOutputDeDescricao(descricaoCursosDisponiveis);
		
		ImprimirTraco();
		
		// Iteração For para mostrar o vetor cursosDisponiveis
		IteracaoFor(cursosDisponiveis);
				
		// Imprimi um traço e um espaço 
		ImprimirTraco();
		System.out.println("");
		
		String opcaoDesejado = "Digite a opção para curso desejado: ";
		ImprimirOutputDeDescricao(opcaoDesejado);
		Integer cursoEscolhido = scanner.nextInt();
		
		// PAGAMENTO
		
		String[] formaDePagamento = new String[] {"Transferência Bancária", "Boleto", "Cartão de Débito", "Cartão de crédito"};
		
		ImprimirTraco();
		System.out.println("");
		
		String descricaoFormasDePagamento = "Formas de pagamento:";
		ImprimirOutputDeDescricao(descricaoFormasDePagamento);
		
		ImprimirTraco();
		
		IteracaoFor(formaDePagamento);
		
		String descricaoEscolhaPagamento = "Escolha a opção de pagamento: ";
		ImprimirOutputDeDescricao(descricaoEscolhaPagamento);
		Integer opcaoDePagamento = scanner.nextInt();
		
		System.out.println("O curso escolhido foi: " + cursosDisponiveis[cursoEscolhido] + " e a forma de pagamento: " + formaDePagamento[opcaoDePagamento]);
				
		scanner.close();	
	}
	
	static void ImprimirTraco() {
		System.out.println("-----------------------");
	}
	
	static void IteracaoFor(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] - " + vetor[i]);
		}
	}
	
	static void ImprimirOutputDeDescricao(String descricao) {
		System.out.println(descricao);
	}
	
}
