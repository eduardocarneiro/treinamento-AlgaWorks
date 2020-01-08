
public class Vetores1Dimensao02 {

	public static void main(String[] args) {
		
		String[] cardapioPizzas = new String[] {"Calabresa", "Atum", "Pizza", "Palmito"};
		
		cardapioPizzas[0] = "Queijo";
		
		for (int i = 0 ; i < cardapioPizzas.length; i++) {
			
			System.out.println("[ " + i + " ] " + cardapioPizzas[i]);
		}
		
	}
}
