import java.util.Scanner;

public class ImpressaoNomeCompleto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println(nome + " " + sobrenome);
		
		scanner.close();
	}
}
