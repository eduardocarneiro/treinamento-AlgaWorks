import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		String[] principaisTarefasUsuario = new String[5];
			
		for (int i = 0 ; i < principaisTarefasUsuario.length; i++) {
			
			System.out.println("Digite a tarefa[" + i + "]: ");
			principaisTarefasUsuario[i] = scanner.nextLine();
			
		}
		
		for (int j = 0; j < principaisTarefasUsuario.length; j++) {
			
			System.out.println("Tarefa[" + j + "]: " + principaisTarefasUsuario[j]);
		}
		
		scanner.close();
	}
}
