package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EscritaArquivos02 {

	public static void main(String[] args) throws IOException {
		
	ArrayList<String> linhas = new ArrayList<String>();
	linhas.add("Conteúdo do arquivo aqui.");
	
	Path arquivo = Paths.get("/tmp/arquivo2.txt");
	Files.write(arquivo, linhas);
	
	System.out.println("arquivo finalizado");
	
	}
}
