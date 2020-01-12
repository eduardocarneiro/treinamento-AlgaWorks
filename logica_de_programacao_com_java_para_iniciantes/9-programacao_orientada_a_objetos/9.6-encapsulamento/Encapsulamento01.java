package encapsulamento;

public class Encapsulamento01 {

	public static void main(String[] args) {
		
		Cliente01 cliente = new Cliente01();
		
		//cliente.nome = "Eduardo Carneiro";
		//cliente.telefone = "11942869687";
		//System.out.println("Nome do cliente: " + cliente.getNome());
		
		cliente.setNome("Eduardo Carneiro");
		cliente.setTelefone("11942869687");
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Telefone do cliente: " + cliente.getTelefone());
			
	}
}
