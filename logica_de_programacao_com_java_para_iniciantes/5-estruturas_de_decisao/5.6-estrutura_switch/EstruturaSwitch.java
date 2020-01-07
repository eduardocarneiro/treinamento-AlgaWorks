import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o mês para desconto: ");
		Integer mesParaDesconto = scanner.nextInt();
		
		Integer desconto = 0;
		switch (mesParaDesconto) {
		
		case 1: desconto = 0;
			break;
		case 2: desconto = 0;
			break;
		case 3: desconto = 5;
			break;
		case 4: desconto = 10;
			break;
		case 5: desconto = 15;
			break;
		case 6: desconto = 15;
			break;
		case 7: desconto = 30;
			break;
		case 8: desconto = 10;
			break;
		case 9: desconto = 10;
			break;
		case 10: desconto = 5;
			break;
		case 11: desconto = 0;
			break;
		case 12: desconto = 0;
			break;
		default: 
				System.err.println("Digite um mês válido.");
				System.exit(1);
		}
		
		System.out.println("O desconto para este mês será de: " + desconto + "%");
		
		scanner.close();
	}
}
