package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		
		Path arquivoDasTarefas = Paths.get("/tmp/listaTarefas1.txt");
		List<String> listaDeTarefas = Files.readAllLines(arquivoDasTarefas);
		
		for (int i = 0; i < listaDeTarefas.size(); i++) {
			String tarefas = listaDeTarefas.get(i); 
			System.out.println("Tarefa[" + (i + 1) + "]: " + tarefas);
		}
		
	}
}
