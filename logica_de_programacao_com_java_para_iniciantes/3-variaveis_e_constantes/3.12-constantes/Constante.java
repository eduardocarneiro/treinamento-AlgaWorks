import java.util.Scanner;

public class Constante {

	static final Integer IDADE_MININA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idadeUsuario = scanner.nextInt();
		
		// final Integer idadeMininaParaTirarCarteira = 18;
		
		Boolean calculoIdade = idadeUsuario >= IDADE_MININA_PARA_TIRAR_CARTEIRA;
		
		if (calculoIdade) {
			System.out.println("Sim!. Pode tiar carteira de motorista.");
		} else {
			System.out.println("Não!. Não pode tirar carteira de motorista.");
		}
		
	}
}
