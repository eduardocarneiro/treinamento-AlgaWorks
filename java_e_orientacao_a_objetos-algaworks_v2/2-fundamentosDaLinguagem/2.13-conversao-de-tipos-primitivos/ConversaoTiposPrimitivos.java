public class ConversaoTiposPrimitivos {

	public static void main (String[] args) {
		// Conversão de tipos primitivos
		// É possível converter os tipos primitivos utilizando "casting"
		/* É possível converter os tipos primitivos SEM utilizar o "casting" 
		   seguindo a seguinte ordem:
		   byte -> short \
			     |    -> int -> long -> float -> double
			   char  /
		*/

		// O "casting" é utilizando na ordem invertida da apresentada a cima.
		// não é recomendado fazer esta conversão inversa, caso não tenha certeza que o valor da variável convertida do tipo 64bits caiba em uma variável tipo 32bits
		// exemplos
		
	       // casting que funciona
		long a = 10;
		int b = (int) a;
		System.out.println(b);

		//casting que NÃO funciona
		long c = 123456789000L;
		int d = (int) c;
		System.out.println(d);
		// valor real de variável c
		System.out.println("valor real de c: " + c);

	}
}
