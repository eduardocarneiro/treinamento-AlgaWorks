package metodoinstancia;

public class MetodoInstancia02 {

	public static void main(String[] args) {
		
		Cliente02 cliente = new Cliente02();
		
		cliente.primeiroNome = "Eduardo";
		cliente.ultimoNome = "Carneiro";
		cliente.telefone = "11942869687";
		cliente.email = "eduardo.oc@gmail.com";
		
		System.out.println("Nome completo do cliente: " + cliente.obterNomeCompleto());
		System.out.println("DDD do cliente: " + cliente.ObterDDD());
		
	}
	
}
