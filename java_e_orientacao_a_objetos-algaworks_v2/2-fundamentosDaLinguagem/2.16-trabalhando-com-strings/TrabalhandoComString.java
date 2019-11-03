public class TrabalhandoComString {

	public static void main (String[] args) {
	
		// manipulando strings e valores
		int a = 10;
		int b = 5;
		int c = a + b;

		// mostrando o resultando da variavel "c" mais um descritivo
		System.out.println("Resultado da soma é: " + c);

		// realizando o calculo de dentro do system.out.println "1"
		System.out.println(a + b + " foi a soma de a + b");

		// realizando o calculo de dentro do system.out.println "2"
		System.out.println("Resultado da some é: " + (a + b));

		// Trabalhando com Strings
		// String não é um tipo primitivo!
		String nome = "Eduardo";
		String sobrenome = "de Oliveira Carneiro";
		String data = "03.11.2019";
		int idade = 34;

		System.out.println("Eu sou o " + nome + " "+ sobrenome + " tenho " + idade + " , e esrevi este programa em " + data);
	}
}
