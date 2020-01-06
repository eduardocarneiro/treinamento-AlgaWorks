import java.util.Scanner;

public class Exercicio02 {

	final static Integer VALOR_DO_FRETE = 15;
	final static Integer FRETE_FREE = 100;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor dor produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean validaFrete = valorProduto >= FRETE_FREE;
		
		if (validaFrete) {
			
			System.out.println("Valor final: " + valorProduto);
			
		} else {
			
			Double valorFinaldoProdutoMaisFrete = valorProduto + VALOR_DO_FRETE;
			System.out.println("Valor final + Frete: " + valorFinaldoProdutoMaisFrete);
		}
		
		
		scanner.close();
		
	}
}
