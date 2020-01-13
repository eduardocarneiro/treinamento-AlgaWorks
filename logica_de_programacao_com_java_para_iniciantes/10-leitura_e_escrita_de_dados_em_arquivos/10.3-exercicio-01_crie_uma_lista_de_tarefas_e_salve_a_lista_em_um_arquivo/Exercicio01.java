package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		
		Path arquivo = Paths.get("/tmp/listaTarefas.txt");
		
		int i = 0;
		while(true) {
		
			System.out.print("Digite a tarefa[" + i + "]: ");
			String tarefa = scanner.nextLine();
			
			Boolean validaTarefaDigitadaPeloUsuario = tarefa.equals("x"); 
			
			if (validaTarefaDigitadaPeloUsuario) {
				System.out.println("Finalizar programa.");
				System.exit(1);
			} else {
				linhas.add(tarefa);
				Files.write(arquivo, linhas);
			}
			i++;
		}

	}
	
}
