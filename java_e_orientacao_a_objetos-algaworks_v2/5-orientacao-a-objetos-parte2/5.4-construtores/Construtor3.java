
public class Construtor3 {

	public static void main(String[] args) {
		
		Construtor3Pessoa3 pessoa1 = new Construtor3Pessoa3("Eduardo");
		System.out.println("Nome: " + pessoa1.nome + " tem " + pessoa1.idade + " anos");
		
		Construtor3Pessoa3 pessoa2 = new Construtor3Pessoa3("Eduardo", 34);
		System.out.println("Nome: " + pessoa2.nome + " tem " + pessoa2.idade + " anos");
		
	}

}
