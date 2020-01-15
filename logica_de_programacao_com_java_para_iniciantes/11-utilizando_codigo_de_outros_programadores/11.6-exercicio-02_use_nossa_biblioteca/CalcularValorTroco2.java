import console.Interacao2;

//import java.util.Scanner;

public class CalcularValorTroco2 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor passado pelo cliente: ");
		Double valorCliente = scanner.nextDouble();
		
		
		Double resultado = valorCliente - valorProduto;
		
		System.out.println("Valor do troco: " + resultado);
		
		scanner.close();
	    */
		
		Interacao2 interacao = new Interacao2();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		Double valorCliente = interacao.lerDecimal("Digite o valor passado pelo cliente: ");
		
		Double resultado = valorCliente - valorProduto;
		
		interacao.imprimir("Valor do troco: " + resultado);
		
		interacao.fechar();
	}
}
