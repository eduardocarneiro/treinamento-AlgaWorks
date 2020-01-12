package encapsulamento;

public class Cliente03 {

	String primeiroNome;
	String ultimoNome;
	String telefone;
	
	// Para gerar automaticamente o encapsulamento das 'variaveis de instacia'
	// Basta seguir os passos:
	// right-click --> source --> Generate Getters and Setters --> 
	// Select Getters and Setters to create: <Select the properties you want to> -->
	// Access Modifier: package
	
	String getPrimeiroNome() {
		return primeiroNome;
	}
	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	String getUltimoNome() {
		return ultimoNome;
	}
	void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
