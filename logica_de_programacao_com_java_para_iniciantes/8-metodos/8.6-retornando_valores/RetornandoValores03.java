import java.util.Scanner;

public class RetornandoValores03 {

	static final Double CEM_POR_CENTO = 100.0;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor: ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Porcetagem: ");
		Double porcentagem = scanner.nextDouble();
		
		// Regra de Três.
		// R$100,00 --- 100%
		//        x --- 20%
		// 100x = 100 * 20
		// x = (100 * 20) / 100
		
		Double resultadoFinalRegraDeTres = calculoRegraDeTres(valor, porcentagem);
		
		System.out.println("O percentual é: " + resultadoFinalRegraDeTres);
		
		scanner.close();
		
	}
	
	static Double calculoRegraDeTres(Double recebeValor, Double recebePorcentagem) {
		
		Double resultadorCalculoRegraDeTres = (recebeValor) * recebePorcentagem / CEM_POR_CENTO ;
		return resultadorCalculoRegraDeTres;
	}
	
}
