import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		String validaIdade = (idade >= 18) ? "Adulto" : "CriancaAdolescente";
		System.out.println("Resultado: " + validaIdade);
	

	}
}
