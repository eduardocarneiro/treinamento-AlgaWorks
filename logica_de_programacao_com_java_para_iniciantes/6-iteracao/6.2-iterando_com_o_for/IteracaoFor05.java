
public class IteracaoFor05 {

	public static void main(String[] args) {
		
		Integer[] produtos = new Integer[]{ 100, 225, 300};
		
		for (int i = 0 ; i < produtos.length; i++) {
			
			Integer produto = produtos[i];
			System.out.println("produto de código: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("produto de código: " + produto + " encontrado");
				break;
			}
		}
	}
}
