import java.util.Scanner;

public class CalculoQuadrado {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valorUsuario = scanner.nextInt();
		
		int calculo = valorUsuario * valorUsuario;
		
		System.out.println("A raiz quadrada do número digitado é: " + calculo);
		
		scanner.close();
		
	}
}
