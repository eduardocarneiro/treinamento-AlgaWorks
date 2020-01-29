
public class Construtor2 {

	public static void main(String[] args) {
		
		Construtor2Pessoa2 pessoa1 = new Construtor2Pessoa2("Eduardo");
		System.out.println("Nome: " + pessoa1.nome + " tem " + pessoa1.idade );
		
		Construtor2Pessoa2 pessoa2 = new Construtor2Pessoa2("Eduardo", 34);
		System.out.println("Nome: " + pessoa2.nome + " tem " + pessoa2.idade + " anos");
		
	}
}
