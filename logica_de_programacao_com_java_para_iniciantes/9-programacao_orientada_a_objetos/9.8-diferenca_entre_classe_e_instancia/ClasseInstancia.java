package encapsulamento;

import primeiraclasse.Produto;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		ClasseInstanciaProduto produto = new ClasseInstanciaProduto();
		
		produto.nome = "Carro";
		
		System.out.println("Produto: " + produto.nome);
		
		ClasseInstanciaProduto produto2 = new ClasseInstanciaProduto();
		produto2.nome = "Moto";
		
		System.out.println("--------");
		
		System.out.println("Quantidade Produto: " + ClasseInstanciaProduto.quantidade);
		
		System.out.println("--------");
		
		ClasseInstanciaProduto.quantidade = 10;
		System.out.println("Quantidade Produto: " + ClasseInstanciaProduto.quantidade);
		
		System.out.println("--------");
		
		ClasseInstanciaImprimir.informacao("Produto1: " + produto.getNome());
		ClasseInstanciaImprimir.erro("Produto2: " + produto2.nome);
		
	}
}
