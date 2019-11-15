import java.util.Scanner;

public class ExemploContinue {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		// Se vc digitar o numero 2, vc recebera todos os numero impares
		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();

		for (int i = 100 ; i <= 200 ; i++ ) {
		
			if (i % numero == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim do programa");
	}
}
