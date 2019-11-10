import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		// Este programa irá dizer qual é a data de vencimento do IPVA de um veiculo.
		// O usuário precisa digitar o ultimo número da placa do veiculo.
		System.out.print("Placa:  ");

		int placa = entrada.nextInt();

		switch (placa) {
		
			case 1:
				System.out.println("Vecimento dia 11 de Janeiro");
				break;
			case 2:
				System.out.println("Vencimento dia 11 de Fevereiro");
				break;

			case 3:
				System.out.println("Vencimento dia 11 de Março");
				break;
			case 4:
				System.out.println("Vencimento dia 11 de Abril");
				break;
			case 5:
				System.out.println("Vencimento dia 11 de Maio");
				break;
			case 6:
				System.out.println("Vencimento dia 11 de Junho");
				break;
			case 7: 
				System.out.println("Vencimento dia 11 de Julho");
				break;
			case 8:
				System.out.println("Vencimento dia 11 de Agosto");
				break;
			case 9: 
				System.out.println("Vencimento dia 11 de Setembro");
				break;
			case 0:
				System.out.println("Vencimento dia 11 de Outubro");
				break;
			default:
				System.out.println("Por favor digite valores entre 0 - 9");
				break;
		}
	}
}
