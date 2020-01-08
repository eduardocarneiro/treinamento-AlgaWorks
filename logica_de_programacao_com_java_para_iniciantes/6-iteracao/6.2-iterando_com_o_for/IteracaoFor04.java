
public class IteracaoFor04 {

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 10 ; i++) {
			
			if (i == 5) {
				System.out.println("Continua...");
				continue;
			}
			
			System.out.println("Iteração: " + i);
		}
	}
}
