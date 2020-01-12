package metodoinstancia;

public class Exercicio02Produto {

	static final Integer ESTOQUE_MINIMO = 10; 
	String nome;
	Integer quatidadeEstoque;
	
	Boolean verificaDisponibilidadeDeEstoque() {
		
		Boolean validaEstoque = quatidadeEstoque >= ESTOQUE_MINIMO;
		if (validaEstoque) {
			System.out.println("NÃO precisa repor estoque.");
		} else {
			System.out.println("SIM precisa repor estoque.");
		}
		 
		return validaEstoque;
	}
	
}
