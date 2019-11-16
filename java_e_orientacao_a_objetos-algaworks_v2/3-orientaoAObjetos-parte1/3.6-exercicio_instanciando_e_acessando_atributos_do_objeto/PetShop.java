
public class PetShop {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Natal";
		cachorro.idade = 5;
		cachorro.raca = "Viralata";
		cachorro.sexo = 'M';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raca: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo );
	}
}
