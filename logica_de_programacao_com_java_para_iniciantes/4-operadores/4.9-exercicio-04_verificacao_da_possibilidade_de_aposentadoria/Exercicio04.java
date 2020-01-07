import java.util.Scanner;

public class Exercicio04 {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO_DA_PREVIDENCIA = 25;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idadeUsuario = scanner.nextInt();
		
		System.out.print("Tempo de contribuição: ");
		Integer tempoDeContribuicaoPrevidencia = scanner.nextInt();
		
		Boolean calculoIdade = idadeUsuario >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean calculoTempoDeContribuicao = tempoDeContribuicaoPrevidencia >= TEMPO_MINIMO_DE_CONTRIBUICAO_DA_PREVIDENCIA;
		
		Boolean calculoAposentadoria = calculoIdade && calculoTempoDeContribuicao;
		
		if (calculoAposentadoria) {
			System.out.println("Sim - Pode aposentar.");
		} else {
			System.out.println("Não - Ainda não pode aposentar. ");
		}
		
		scanner.close();
	}
}
