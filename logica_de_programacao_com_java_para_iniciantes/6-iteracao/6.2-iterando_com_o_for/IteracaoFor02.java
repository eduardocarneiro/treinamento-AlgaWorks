
public class IteracaoFor02 {

	public static void main(String[] args) {
		
		Double[] carrinhoDeCompras = new Double[]{ 10.0, 11.0, 12.0 };
		Double total = 0.0;
		
		for (int i = 0; i < carrinhoDeCompras.length ; i++) {
			
			System.out.println("Iteração: " + i + " - total: " + total);
			total = total + carrinhoDeCompras[i];
		}
		
		System.out.println("Total: " + total);
	}
}
