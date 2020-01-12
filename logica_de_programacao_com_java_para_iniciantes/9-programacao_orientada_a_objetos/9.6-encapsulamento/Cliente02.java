package encapsulamento;

public class Cliente02 {

	String primeiroNome;
	String ultimoNome;
	String telefone;
	
	String getNome() {
		return primeiroNome + " " + ultimoNome;	
	}
	
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
	}
}
