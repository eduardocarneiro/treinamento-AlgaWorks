
public class Vetores1Dimensao03 {

	public static void main(String[] args) {
		
		String[] cardapioPizzas = new String[4];
		
		cardapioPizzas[0] = "Atum";
		cardapioPizzas[1] = "Calabresa";
		cardapioPizzas[2] = "Pizza";
		cardapioPizzas[3] = "Palmito";
		
		for (int i = 0; i < cardapioPizzas.length; i++) {
			
			System.out.println("[ " + i + " ] " + cardapioPizzas[i]);
		}
	}
}
