package encapsulamento;

public class Cliente01 {

	String nome; 
	String telefone;

	// Encapsulamento da propriedade "String nome"
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	// Encapsulamento da propriedade "String telefone"
	String getTelefone() {
		return telefone;
	}
	
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}

