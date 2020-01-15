package bibliotecapropria;

import console.Interacao2;

//import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		/*Interacao interacao = new Interacao();
		
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: " + numero);
		
		Double decimal = interacao.lerDecimal("Decimal: ");
		interacao.imprimir("Numero decimal: " + decimal);
		
		interacao.erro("Msg de erro");
		
		interacao.fechar();
		*/
		
		Interacao2 interacao = new Interacao2();
		
		Integer numero = interacao.lerNumero("Digite um numero inteiro: ");
		interacao.imprimir("Numero: " + numero);
		
		interacao.fechar();
		
		
		
	}

}
