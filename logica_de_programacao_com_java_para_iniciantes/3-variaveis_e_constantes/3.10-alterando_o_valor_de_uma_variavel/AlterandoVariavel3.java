import java.util.Scanner;

public class AlterandoVariavel3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a forma de pagamento [1 - a vista ; 2 - a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamento = tipoPagamento.equals(1);
		
		Double desconto = 0.0;
		Double juros = 0.0;
		
		if (pagamento) {
			desconto = 5.0;
			Double calculoDesconto = (valorProduto * desconto) / 100;
			Double valorTotalDesconto = valorProduto - calculoDesconto;
			
			System.out.println("Valor Total: " + valorTotalDesconto);
			
		} else {
			juros = 10.0;
			Double calculoJuros = (valorProduto * juros) / 100;
			Double valorTotalJuros =  valorProduto + calculoJuros;
			
			System.out.println("Valor Total: " + valorTotalJuros);
		}
		
		scanner.close();
	}
}
