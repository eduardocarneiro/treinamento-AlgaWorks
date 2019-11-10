import java.util.Scanner;

public class Escopo {

	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;

		String nomePai = "";

		if (!podeDirigir) {
			System.out.print("Qual é o nome do seu Pai: ");
			nomePai = entrada.next();
		}

		System.out.println("Voce pode Dirigir?");

		if (podeDirigir) {
			System.out.println("Sim, claro!");
		} else { 

			System.out.println("Nao, se fizer isto, seu pai " + nomePai + " vai preso"); 
		}

	}
}
