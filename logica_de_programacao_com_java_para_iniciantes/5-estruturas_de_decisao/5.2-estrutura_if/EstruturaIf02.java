
public class EstruturaIf02 {

	static final Integer TEMPO_MINIMO_DE_TEMPO_DE_CONTA_ABERTA_PARA_EMPRESTIMO = 5;
	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Toda expressão que retorna um valor \"booleano\", pode ser usada dentro dos parênteses de um \"if\"");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("");
		
		Double valorDoEmprestimo = 4000.0;
		Double salarioDoCliente = 2000.0;
		
//		Boolean validaSalarioDoCliente = (salarioDoCliente * 2) >= valorDoEmprestimo;
//		Boolean aContaTemTempoSuficienteDeAbertura = TEMPO_MINIMO_DE_TEMPO_DE_CONTA_ABERTA_PARA_EMPRESTIMO >= 5;
		Boolean temNomeLimpoNoSPC = true;
		
		if (((salarioDoCliente * 2) >= valorDoEmprestimo) && (TEMPO_MINIMO_DE_TEMPO_DE_CONTA_ABERTA_PARA_EMPRESTIMO >= 5) && temNomeLimpoNoSPC) {
			System.out.println("Pode liberar o empréstimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}	
		
		// Invertendo
		
		if (!(((salarioDoCliente * 2) >= valorDoEmprestimo) && (TEMPO_MINIMO_DE_TEMPO_DE_CONTA_ABERTA_PARA_EMPRESTIMO >= 5) && temNomeLimpoNoSPC)) {
			System.out.println("Pode liberar o empréstimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}	
	}

}
