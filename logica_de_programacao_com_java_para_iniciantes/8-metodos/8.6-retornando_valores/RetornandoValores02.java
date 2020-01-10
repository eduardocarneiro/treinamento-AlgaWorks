
public class RetornandoValores02 {

	public static void main(String[] args) {
		
		// R$100,00 --- 100%
		//        x --- 20%
		
		Double[] premissa = new Double[] {100.0, 100.0};
		Double porcentagem = 30.0;
	
		Double ResultadoFinal = calculoRegraDeTres(premissa, porcentagem); 
		System.out.println("Resultado: " + ResultadoFinal);
		
	}
	
	static Double calculoRegraDeTres(Double[] recebePremissa, Double recebePorcentagem) {
		
		Double resultado = (recebePremissa[0] * recebePorcentagem) / recebePremissa[1];
		return resultado;
	}
	
}
