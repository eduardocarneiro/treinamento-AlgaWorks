
public class Construtor3Pessoa3 {

	String nome;
	int idade;
	
	Construtor3Pessoa3(String nome) {
	
		this.nome = nome;
	}
	
	Construtor3Pessoa3(String nome, int idade) {
	
		this(nome); // esta opcao ira chamar o construtor acima e executa e depois continuar este construtor
		this.idade = idade;
		
	}
	
}
