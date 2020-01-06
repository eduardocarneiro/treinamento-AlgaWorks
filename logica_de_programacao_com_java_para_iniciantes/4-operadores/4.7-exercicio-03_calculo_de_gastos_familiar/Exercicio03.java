import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double total = 0.0;
		
		System.out.println("Gasto Familiar");
		System.out.println("---------------");
		System.out.println("");
		
		System.out.print("Conta de luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de água: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de escola: ");
		total += scanner.nextDouble();
		
		System.out.println("Fatura cartão: ");
		total += scanner.nextDouble();
		
		System.out.println("Conta de mercado: ");
		total += scanner.nextDouble();
		
		 System.out.println("Total dos gastos: " + total);
		
		scanner.close();
	}
}
