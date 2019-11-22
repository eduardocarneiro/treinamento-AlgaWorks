public class Boxing {

	public static void main(String[] args) {
		Integer i = new Integer("10"); // Wrapper, criando um objeto i;
		
		// Boxing
		Integer j = 10;
		
		// Unboxing
		int x = i;
		int y = i.intValue(); // melhor opcao
		
		// ----
		
		Integer a1 = 127;
		Integer a2 = 127;
		
		Integer a3 = 128;
		Integer a4 = 128;
		
		System.out.println(a1 == a2);
		System.out.println(a3 == a4);
		
		System.out.println("Forma correta.");
		System.out.println(a1.equals(a2));
		System.out.println(a3.equals(a4));
		
		System.out.println("other referece: \"https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275\"" );
	}
}
