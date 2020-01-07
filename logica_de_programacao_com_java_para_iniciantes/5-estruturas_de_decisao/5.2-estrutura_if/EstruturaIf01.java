
public class EstruturaIf01 {

	public static void main(String[] args) {
		
		Boolean movimentaMetadoDoValorDoEmprestimo = true;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpoNoSPC = true;
		
		Boolean liberarEmprestimo = movimentaMetadoDoValorDoEmprestimo && aContaTemTempoSuficienteDeAbertura && temNomeLimpoNoSPC;
		
		if (!liberarEmprestimo) {
			System.out.println("Pode liberar o empréstimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}
		
		// invertendo o de true para false (!liberarEmprestimo)
//		if (!liberarEmprestimo) {
//			System.out.println("Pode liberar o empréstimo.");
//		} else {
//			System.out.println("Não pode liberar o empréstimo.");
//		}
	}
}
