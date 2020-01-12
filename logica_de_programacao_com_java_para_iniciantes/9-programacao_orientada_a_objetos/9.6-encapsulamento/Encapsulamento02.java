package encapsulamento;

public class Encapsulamento02 {

	public static void main(String[] args) {
		
		Cliente02 cliente = new Cliente02();
		
		cliente.setNome("Eduardo Carneiro");

		// Mostra o nome completo do cliente.
		System.out.println("Nome do Cliente: " + cliente.getNome());
		
	}
}
