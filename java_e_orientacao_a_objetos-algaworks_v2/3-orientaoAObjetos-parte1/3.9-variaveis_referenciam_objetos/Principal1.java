
public class Principal1 {

	public static void main(String[] args) {
	
		Proprietario1 donoPrincipal = new Proprietario1();
		donoPrincipal.nome = "EOC";
		
		Carro1 primeiroCarro = new Carro1();
		primeiroCarro.modelo = "Fusca";
		
		Carro1 segundoCarro = new Carro1();
		segundoCarro.modelo = "Fiat 147";
		
		primeiroCarro.dono = donoPrincipal;
		segundoCarro.dono = donoPrincipal;
		
		System.out.println("primeiroCarro.dono1: " + primeiroCarro.dono.nome);
		System.out.println("segundoCarro.dono1: " + segundoCarro.dono.nome);
		System.out.println("donoPrincipal.nome: " + donoPrincipal.nome);
		
		System.out.println("O proprietario: " + donoPrincipal.nome + " possui os carros: " + primeiroCarro.modelo + " e " + segundoCarro.modelo);
		
		
	}
	
}
