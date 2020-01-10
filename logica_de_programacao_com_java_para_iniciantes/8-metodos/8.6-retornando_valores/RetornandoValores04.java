import java.util.Scanner;

public class RetornandoValores04 {

	public static void main(String[] args) {
		
		// Using Scanner inside a method
		
		Scanner scanner = new Scanner(System.in);
		
		String descricao = "Digite um número: ";
		Integer numeroUsuario = recebeNumeroUsuario(descricao, scanner);
		
		System.out.println("O número digitado foi: " + numeroUsuario);
		
		scanner.close();
		
	}
	
	
	static Integer recebeNumeroUsuario(String texto, Scanner recebeScanner) {
		System.out.print(texto);
		Integer numeroUsuarioViaMetodo = recebeScanner.nextInt();
		return numeroUsuarioViaMetodo;
	}
	
}
