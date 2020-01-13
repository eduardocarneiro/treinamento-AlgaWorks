package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EscritaArquivos01 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> linhas = new ArrayList<String>();
		linhas.add("linha um");
		
		Path arquivo = Paths.get("/tmp/arquivo.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("fim.");
		
	}
}
