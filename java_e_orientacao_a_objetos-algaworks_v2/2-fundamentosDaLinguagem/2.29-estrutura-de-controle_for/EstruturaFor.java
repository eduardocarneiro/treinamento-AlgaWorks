import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in); 

	System.out.print("Digite o valor final: ");
	int valorFinal = entrada.nextInt();

	for (int i = 1; i <= valorFinal; i++) {
		System.out.println(i);
	}
	
	}
}
