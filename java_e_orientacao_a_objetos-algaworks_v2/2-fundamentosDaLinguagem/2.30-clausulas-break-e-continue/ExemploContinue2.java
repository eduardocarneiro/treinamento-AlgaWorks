import java.util.Scanner;

public class ExemploContinue2 {

	public static void main(String[] args) {

		// se voce digitar o numero 2, vc recebera todos os numeros pares
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");

		int numero = entrada.nextInt();


		for ( int i = 100 ; i <= 200 ; i++) {
		
			if (i % numero == 0) {
			
				System.out.println(i);
				continue;
			}
			//System.out.println(i);
		}
		System.out.println("Fim do programa!");
	}
}
