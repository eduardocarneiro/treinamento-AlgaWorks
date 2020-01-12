import java.util.Scanner;

public class Exercicio04 {

	static final Integer NUMERO_INICIAL_RECURSIVIDADE_TABUADA = 0;
	static final Integer NUMERO_FINAL_RECURSIVIDADE_TABUADA = 10;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja realizar a tabuada: ");
		Integer numeroUsuario = scanner.nextInt();
		
		ImprimirTabuada(numeroUsuario, NUMERO_INICIAL_RECURSIVIDADE_TABUADA);
		
		scanner.close();
	}
	
	static void ImprimirTabuada(Integer numeroUsuario, Integer recebeNumero) {
		
			if( recebeNumero <= NUMERO_FINAL_RECURSIVIDADE_TABUADA) {
				
				Integer calculoTabuada = numeroUsuario * recebeNumero;
				System.out.println(numeroUsuario + " x " + recebeNumero + " = " + calculoTabuada); 
				ImprimirTabuada(numeroUsuario, ++recebeNumero);
			}
	}
}
