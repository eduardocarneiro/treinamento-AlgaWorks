public class IncrementoDecremento {

	public static void main(String[] args) {
	
		// formas de incremento.
		// forma 1;
		int valor1 = 10;
		valor1 = valor1 + 1;
		System.out.println(valor1);
		
		// forma 2;
		int valor2 = 10;
		valor2 += 1;
		System.out.println(valor2);
		
		// forma 3;
		int valor3 = 10;
		valor3++;
		System.out.println(valor3);

		// forma 4;
		// esta forma irá entragar o valor 10 para a variavel "resultValor4" e depois ira fazer o incremento;
		int valor4 = 10;
		int resultValor4 = valor4++;
		System.out.println(valor4);
		System.out.println(resultValor4);

		// forma 5;
		int valor5 = 10;
		int resultValor5 = ++valor5;
		System.out.println(resultValor5);


		// O mesmo vale para o DESCREMENTO, basta substituir o simbolo "+" para "-"

	}
}
