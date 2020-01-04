import java.util.Scanner;

public class AlterandoVariavel2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a forma de pagamento [1 - a vista ; 2 - a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamento = tipoPagamento.equals(2);
		
		Double juros = 0.0;
		
		if (pagamento) {
			juros = 10.0;
		}
		
		Double calculoAcrescimo = (valorProduto * juros) / 100;
		Double valorTotal = valorProduto + calculoAcrescimo;
		
		System.out.println("Valor total: " + valorTotal);
		
		scanner.close();
	}
}
