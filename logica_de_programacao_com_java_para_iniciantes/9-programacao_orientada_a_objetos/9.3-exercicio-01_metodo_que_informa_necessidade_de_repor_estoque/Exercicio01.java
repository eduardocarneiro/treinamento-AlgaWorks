package primeiraclasse;

import java.util.Scanner;

public class Exercicio01 {
 
	static final Integer QUANTIDADE_MINIMA_EM_ESTOQUE = 10;
	public static void main(String[] args) {
		
		Exercicio01Produto produto = new Exercicio01Produto();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Produto desejado: ");
		produto.nome = scanner.nextLine();
		
		System.out.print("Quantidade do produto: ");	
		produto.quantidadeEstoque = scanner.nextInt();
		
		verificaDisponibilidadeDeEstoque(produto);
		
		scanner.close();
	}
	
	static Boolean verificaDisponibilidadeDeEstoque(Exercicio01Produto produto) {
		
		Boolean validaEstoque = produto.quantidadeEstoque >= QUANTIDADE_MINIMA_EM_ESTOQUE;
		
		if(validaEstoque) {
			System.out.println("Necessário repor o estoque.");
		} else {
			System.out.println("Não é necessário repor o estoque.");
		}
		
		return validaEstoque;
		
	}
}
