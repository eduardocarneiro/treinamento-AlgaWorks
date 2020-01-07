
public class OperadoresDeIncrementoEDecremento {

	public static void main(String[] args) {

		System.out.println("Operador: Incremento");
		System.out.println("--------------------");
		
		Integer numero = 10;
		System.out.println("Número antes do incremento: " + numero);
		
		++numero;
		
		System.out.println("Número depois do incremento: " + numero);
		
		System.out.println("");

		System.out.println("#####################");
		
		System.out.println("Uso do incremento \"++variavel\" e \"variavel++\"");
		System.out.println("Uso do decremento \"--variavel\" e \"variavel--\", funciona igual o incremento.");
//		System.out.println("\"Integer numero2 = 20;\"");
//		System.out.println("Quando \"Integer calculaNumero2 = ++numero2;\": é feito primeiro o incremento na em numero2 para depois calculaNumero2 receber o valor de 21. ");
//		System.out.println("\"Integer numero3 = 20;\"");
//		System.out.println("Quando \"Integer calculaNumero3 = ++numero3;\": calculaNumero3 primeiro recebe o valor de numero3 que é 20 e depois faz o incremento;
		System.out.println("");
		
		System.out.println("Incremento");
		System.out.println("----------");
		//##
		Integer numero2 = 20;
		Integer calculaNumero2 = ++numero2;
		
		Integer numero3 = 20;
		Integer calculaNumero3 = numero3++;
		
		System.out.println("++numero2: " + calculaNumero2);
		System.out.println("numero3++: " + calculaNumero3);
		//##
		System.out.println("");
		
		System.out.println("Decremento");
		System.out.println("----------");
		//##
		Integer numero4 = 20;
		Integer calculaNumero4 = --numero4;
		
		Integer numero5 = 20;
		Integer calculaNumero5 = numero5--;
		
		System.out.println("--numero4: " + calculaNumero4);
		System.out.println("numero5--: " + calculaNumero5);
		//##
	}

}
