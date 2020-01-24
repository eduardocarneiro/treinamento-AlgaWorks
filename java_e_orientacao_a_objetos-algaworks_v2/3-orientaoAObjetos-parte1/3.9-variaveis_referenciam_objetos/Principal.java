
public class Principal {

	public static void main(String[] args) {
		
		Proprietario2 proprietario = new Proprietario2();
		proprietario.nome = "Eduardo";
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.modelo = "208";
		
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.modelo = "onix";
		
		
		veiculo1.dono = proprietario;
		veiculo2.dono =  proprietario;
		
		System.out.println("veiculo1.dono.nome: " + veiculo1.dono.nome);
		System.out.println("veiculo2.dono.nome: " + veiculo2.dono.nome);
		
		System.out.println("proprietario.nome: " + proprietario.nome);
		 
	}

}
