package metodoinstancia;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Exercicio02Produto produto = new Exercicio02Produto();
		
		produto.nome = "TV";
		produto.quatidadeEstoque = 9;
		
		produto.verificaDisponibilidadeDeEstoque();
		
	}
	
}
