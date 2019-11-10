import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Tipo do Veiculo:");
		System.out.println(" - passeio;");
		System.out.println(" - caminhao;");
		System.out.print("Escolha uma opção: ");

		String tipoVeiculo = entrada.next();

		// velocidade maxima da via
		System.out.print("Velocidade maxima da via: ");
		int velocidadeMaxima = entrada.nextInt();

		// velocidade do veiculo
		System.out.print("Velocidade do veiculo: ");
		int velocidadeVeiculo = entrada.nextInt();

		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > (velocidadeMaxima * 1.1)) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > (velocidadeMaxima * 1.05))) {
			System.out.println("Multa");
		
		} else {
			System.out.println("Veiculo nao será multado");
		
		}

	}
}
