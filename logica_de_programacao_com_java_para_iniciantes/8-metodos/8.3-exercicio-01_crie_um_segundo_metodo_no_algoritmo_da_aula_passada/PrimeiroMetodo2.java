import java.util.Scanner;

public class PrimeiroMetodo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cursosDisponiveis = new String[] {"Java Básico", "Spring Suite", "Java OO avançado"};
		
		System.out.println("Curso disponíveis:");
		ImprimirTraco();
		
		for (int i = 0; i < cursosDisponiveis.length; i++) {
			
			System.out.println("[" + i + "] - " + cursosDisponiveis[i]);
		}
		
		ImprimirTraco();
		ImprimirEspaco();
		
		System.out.print("Digite a opção para curso desejado: ");
		Integer cursoEscolhido = scanner.nextInt();
		
		ImprimirEspaco();
		System.out.println(cursosDisponiveis[cursoEscolhido]);
	}	
	
	static void ImprimirTraco() {
		System.out.println("-----------------------");
	}
	
	static void ImprimirEspaco() {
		System.out.println("");
	}
}
