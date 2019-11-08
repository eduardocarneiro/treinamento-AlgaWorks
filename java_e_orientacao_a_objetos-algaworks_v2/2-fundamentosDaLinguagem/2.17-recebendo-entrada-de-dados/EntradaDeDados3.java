import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] arg) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu primeiro nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("peso: " + peso);



	}
}
