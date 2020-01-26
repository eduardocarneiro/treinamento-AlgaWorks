
public class PrincipalCarro {

	public static void main(String[] args) {
	
		Carro carro = new Carro();
		
		carro.modelo = "Onix";
	
		System.out.println("modelo antes: " + carro.modelo);
		
		carro.mudarModelo("208");
		
		System.out.println("modelo depois: " + carro.modelo);
		
	}

}
