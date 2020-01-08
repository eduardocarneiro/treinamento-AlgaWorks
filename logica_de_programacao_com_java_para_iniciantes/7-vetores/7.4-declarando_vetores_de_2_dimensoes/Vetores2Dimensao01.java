
public class Vetores2Dimensao01 {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1500.00, 2000.00, 1700.00};
		Double[] faturamentoFevereiro = new Double[] {3000.00, 3500.00, 3800.00};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
		System.out.println("Faturamento do dia 2 de Fevereiro: " + faturamentoAnual[1][1]);
		
	}
}
