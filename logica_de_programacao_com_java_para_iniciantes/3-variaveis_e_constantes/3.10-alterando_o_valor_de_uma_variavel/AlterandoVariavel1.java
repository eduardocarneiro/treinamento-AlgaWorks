import java.util.Scanner;

public class AlterandoVariavel1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a forma de pagamento [1 - a vista ; 2 - a prazo: ]");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamento = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamento) {
			juros = 10.0;
		}
		
		Double acrescimo = (valorProduto * juros) / 100;
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor Total: " + valorTotal);
		
		scanner.close();
	}
}
