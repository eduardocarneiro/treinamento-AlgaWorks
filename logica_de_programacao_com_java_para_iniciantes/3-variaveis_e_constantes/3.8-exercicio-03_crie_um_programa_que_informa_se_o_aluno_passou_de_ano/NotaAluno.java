import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean calculoNotaAluno = notaAluno >= 70;
		
		if (calculoNotaAluno) {
			
			System.out.println("Aluno Passou de ano! e sua nota foi " + notaAluno);
		} else {
			
			System.out.println("Aluno não passou de ano! e sua nota foi " + notaAluno) ;
		}
		
		scanner.close();
	}
}
