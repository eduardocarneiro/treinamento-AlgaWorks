public class OperadoresDeComparacaoEIgualdade {

	public static void main(String[] args) {

		// Operadores de igualdade
		// maior  > , maior ou igual >= , menor < , menor ou igual <=
		// igual == , diferente !=

		int a = 10;
		int b = 5;
		int c = 2;

		boolean maior = a > b;
		boolean maiorIgual = c >= b;
		boolean menor = a < c;
		boolean menorIgual = c <= b;

		System.out.println(maior); // true
		System.out.println(maiorIgual); // false
		System.out.println(menor); // false 
		System.out.println(menorIgual); // true
	} 
}
