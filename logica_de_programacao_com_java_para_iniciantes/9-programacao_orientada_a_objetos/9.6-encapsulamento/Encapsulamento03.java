package encapsulamento;

public class Encapsulamento03 {

	public static void main(String[] args) {
		
		Cliente03 cliente = new Cliente03();
		
		cliente.setPrimeiroNome("Eduardo");
		cliente.setUltimoNome("Carneiro");
		
		System.out.println("Nome completo do cliente: " + cliente.getPrimeiroNome() + " " + cliente.getUltimoNome());
	}
}
