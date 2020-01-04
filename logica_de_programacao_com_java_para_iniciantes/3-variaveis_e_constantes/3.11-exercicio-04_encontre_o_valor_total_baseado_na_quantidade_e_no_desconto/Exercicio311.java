import java.util.Scanner;

public class Exercicio311 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double calculoSubtotalProduto = valorProduto * quantidadeProduto;
		
		Boolean verificaQuantidadeProduto = quantidadeProduto >= 10;
		
		Double desconto = 0.0;
		
		if (verificaQuantidadeProduto) {
			desconto = 10.0;
		}
		
		Double calculoDesconto = (calculoSubtotalProduto * desconto) / 100;
		Double valorTotal = calculoSubtotalProduto - calculoDesconto;
		
		System.out.println("Valor produto: " + valorTotal);
		
		
		scanner.close();
	}
}
