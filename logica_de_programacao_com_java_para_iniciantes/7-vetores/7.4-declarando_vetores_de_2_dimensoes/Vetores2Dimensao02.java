
public class Vetores2Dimensao02 {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {100.0, 200.0, 300.0};
		Double[] faturamentoFevereiro = new Double[] {400.0, 500.0, 600.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		for (int i = 0 ; i < faturamentoAnual.length; i++) {
			
			System.out.println("Mês: " + (i +1));
			
			Double[] mes = faturamentoAnual[i];
			
			for (int j = 0; j < mes.length; j++) {
				
				Double dia = mes[j];
				
				System.out.println("Faturamento do dia " + (j + 1) + ": " + dia);
			}
 
		}
	}
}
