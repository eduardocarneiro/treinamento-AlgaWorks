import java.util.Scanner;

public class Exercicio313 {

	static final Integer MEDIA_NOTA_PARA_PASSAR_DE_ANO = 70;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digita a nota do Aluno: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean calculoDeNota = notaAluno >= MEDIA_NOTA_PARA_PASSAR_DE_ANO;
		
		if (calculoDeNota) {
			System.out.println("Passou de ano!");
		} else {
			System.out.println("Não passou de ano!");
		}
	}
}
