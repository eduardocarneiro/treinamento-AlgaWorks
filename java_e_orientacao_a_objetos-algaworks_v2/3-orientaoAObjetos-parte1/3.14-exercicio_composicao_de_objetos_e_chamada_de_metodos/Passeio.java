
public class Passeio {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Eduardo";
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Natal";
		p1.cachorro.idade = 4;
		p1.cachorro.raca = "Vira Latas";
		p1.cachorro.sexo = 'M';
		
		/*
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Natal";
		cachorro.idade = 4;
		cachorro.raca = "Vira Latas";
		cachorro.sexo = 'M';
		*/
		
		Caminhada c = new Caminhada();
		c.andar(p1);
	}
}
