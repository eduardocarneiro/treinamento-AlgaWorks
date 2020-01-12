package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Produto produto = new Produto();		
		produto.nome = "SmartPhone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 20;
		
		exibirProduto(produto);
	}
	
	static void exibirProduto(Produto produto) {
		
		System.out.println("O nome do produto é: " + produto.nome + ", e sua quantidade em estoque é de: " + produto.quantidade + " unidades.");
	}
}
