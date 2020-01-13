package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos03 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador[" + (i+1) + "]: ");
			String nomeJogador = scanner.nextLine();
			
			linhas.add(nomeJogador);
		}
		
		Path arquivo = Paths.get("/tmp/arquivo3.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("Arquivo criado com sucesso.");
		
		scanner.close();
	}
	
}
