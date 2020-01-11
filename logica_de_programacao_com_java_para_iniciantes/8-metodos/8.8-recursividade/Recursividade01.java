
public class Recursividade01 {

	public static void main(String[] args) {
		// Recursividade é quando você tem um método chamando o próprio método.
		
		ImprimirNumero(0);
		
	}
	
	static void ImprimirNumero(Integer numero) {
		
		if (numero <= 10) {
			System.out.println(numero);
			ImprimirNumero(++numero);
		}
	}
}
