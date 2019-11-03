public class PromocaoAritmetica {

	public static void main (String[] args) {
		
		/* É possível promover uma variável utilizando "casting" ou utilizando um outro tipo de variável,
		 * e sempre é necessário seguir o modelo abaixo da esquerda para a direita. 
		 * byte -> short \
		 *                |--> int -> long -> float -> double
		 *         char  /
		 */

		int a = 10;
		long b = 5;
		long c = a + b;
		System.out.println(c);

		// Utilizando Casting

		int d = 5;
		int e = 3;
		float f =  d / (float) e;
		System.out.println(f);
	}
}
