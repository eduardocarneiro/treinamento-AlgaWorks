public class CalculadoraProfessor {

	public static void main (String[] args) {
		
		boolean calculoDetalhado = true;
		float pi = 3.14f;
		float raio = 5.3f;
		float area = raio * raio * pi;
		System.out.println("Resultado " + area);


		// converter para inteiro
		int convertInteiro = (int) area;
		System.out.println("Resultado convertido em Inteiro " + convertInteiro);
		
		// mostra calculo detalhado
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}

	}
}
