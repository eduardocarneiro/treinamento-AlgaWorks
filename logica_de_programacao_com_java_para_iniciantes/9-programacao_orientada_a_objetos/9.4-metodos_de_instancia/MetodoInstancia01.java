package metodoinstancia;

public class MetodoInstancia01 {

	public static void main(String[] args) {
			
		Cliente01 cliente = new Cliente01();
		
		cliente.primeiroNome = "Eduardo";
		cliente.ultimoNome = "Carneiro";
		cliente.telefone = "11942869687";
		cliente.email = "eduardo.oc@gmail.com";
		
		System.out.println("Nome completo do cliente: " + nomeCompletoCliente(cliente));
	
	}
	
	// Método de Instância estático. por causa do "static"
	static String nomeCompletoCliente(Cliente01 cliente) {
		
		String retornaNomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
		return retornaNomeCompleto;
		
	}
	
}
