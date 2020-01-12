package metodoinstancia;

public class Cliente02 {

	String primeiroNome;
	String ultimoNome;
	String telefone;
	String email;

	String obterNomeCompleto() {
		String nomecompleto = primeiroNome + " " + ultimoNome;
		return nomecompleto;
	}
	
	String ObterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
}

