import java.util.Scanner;

public class Exercicio45Arrarys {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite quantidade de produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		//scanner.nextInt();
		
		EstoqueExercicio45Arrays estoque = new EstoqueExercicio45Arrays();
		
		estoque.produtos = new ProdutoExercicio45Arrays[quantidadeProduto];
		
		for (int i = 0 ; i < estoque.produtos.length ; i++ ) {
			estoque.produtos[i] = new ProdutoExercicio45Arrays();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------------");
			
			System.out.print("Descrição:");
			estoque.produtos[i].descricao = scanner.nextLine();
			
			System.out.println("");
			System.out.print("Quantidade de itens:");			
			estoque.produtos[i].quantidade = scanner.nextInt();
			scanner.nextLine();
			
		}
		
		estoque.listarProdutos();
		scanner.close();

	}

}
