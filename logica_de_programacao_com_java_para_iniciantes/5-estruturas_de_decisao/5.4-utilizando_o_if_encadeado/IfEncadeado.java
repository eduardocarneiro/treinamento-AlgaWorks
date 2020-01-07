import java.util.Scanner;

public class IfEncadeado {

	static final Integer MINIXMO_CATEGORIA_PESO_LEVE = 50;
	static final Integer MAXIMO_CATEGORIA_PESO_LEVE = 70;
	static final Integer MAXIMO_CATEGORIA_PESO_MEDIO = 90;
	static final Integer MAXIMO_CATEGORIA_PESO_PESADO = 150;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Peso: ");
		Double pesoAtleta = scanner.nextDouble();
		
		Boolean calculoPesoLeve = (pesoAtleta >= MINIXMO_CATEGORIA_PESO_LEVE) && (pesoAtleta <= MAXIMO_CATEGORIA_PESO_LEVE);
		Boolean calculoPesoMedio = (pesoAtleta > MAXIMO_CATEGORIA_PESO_LEVE) && (pesoAtleta <= MAXIMO_CATEGORIA_PESO_MEDIO);
		Boolean calculoPesoPesado = (pesoAtleta > MAXIMO_CATEGORIA_PESO_MEDIO) && (pesoAtleta <= MAXIMO_CATEGORIA_PESO_PESADO);
		
		if (calculoPesoLeve) {
			System.out.println("O lutador(a) é peso leve.");
		} else if (calculoPesoMedio) {
			System.out.println("O lutador(a) é peso médio.");
		} else if (calculoPesoPesado) {
			System.out.println("O lutador(a) é peso pesado.");
		} else {
			System.out.println("O lutador(a) não se encaixa em nenhuma categoria");
		}
		
		scanner.close();
	}
}
