
public class IteracaoWhile {
	
	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
			System.out.println("Iteração: " + i + " - mensagem qualquer");
			if (i == 5) {
				i++;
				System.out.println("iteracao 5");
				continue;
			}
			i++;
		}
	}
}
