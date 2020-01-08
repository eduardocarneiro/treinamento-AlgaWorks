import java.util.Scanner;

public class Vetores1Dimensao01 {

	public static void main(String[] args) {
		
		String[] cardapioPizzas = new String[] {"Calabresa", "Atum", "Pizza", "Queijo", "Palmito"};
		
		for (int i = 0; i < cardapioPizzas.length; i++) {
			
			System.out.println("[ " + i + " ]" + " - " + cardapioPizzas[i]);
						
		}
		
		System.out.println("");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de referência da pizza desejada: ");
		Integer escolhaDoUsuario = scanner.nextInt();
		
		System.out.println("A sua escolha foi: " + cardapioPizzas[escolhaDoUsuario]);
		
		scanner.close();
		
	}
}