
public class Principal2 {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		
		carro.fabricante = "Peugeot";
		carro.modelo = "208";
		carro.anoDeFabricacao = 2016;
		carro.cor = "preto";
		
		
		carro.dono.nome = "Eduardo O. Carneiro";
		carro.dono.cpf = "3347899874";
		carro.dono.idadeProprietario = 34;
		carro.dono.endereco = "Av. Paulista";
		carro.dono.bairro = "Jardins";
		carro.dono.cidade = "Sao Paulo";
		
		
		System.out.println(carro.dono.nome);
	}
}
