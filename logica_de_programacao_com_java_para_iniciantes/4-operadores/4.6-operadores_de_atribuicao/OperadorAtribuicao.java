
public class OperadorAtribuicao {

	public static void main(String[] args) {
		
		System.out.println("[Operador]    [Tipo]           [Descrição]");
		System.out.println("=             ATRIBUIÇÃO       Atribui algum valor para a variável");
		System.out.println("+= e -=       ATRIBUIÇÃO       Faz a operação - adição ou subtração - e, depois, a atribuição");
		System.out.println("*= e /=       ATRIBUIÇÃO       Faz a operação - multiplicação ou divisão - e, depois, a atribuição");
		System.out.println("%=            ATRIBUIÇÃO       Faz a operação - módulo - e, depois, a atribuição");
		
		System.out.println("");
		System.out.println("Exemplos:");
		System.out.println("-----------");
		
		// Operador de atribuição de valor
		Integer numero1 = 1;
		System.out.println("numero1 = 1: " + numero1);
		
		// Operador de adição
		Integer numero2 = 1;
		numero2 += 1;
		System.out.println("numero2 += 1: " + numero2);
		
		// Operador de subtração
		Integer numero3 = 1;
		numero3 -= 1;
		System.out.println("numero3 -= 1: " + numero3);
		
		// Operador de multiplicação
		Integer numero4 = 2;
		numero4 *= 2;
		System.out.println("numero4 *= 2: " + numero4);
		
		// Operador de divisão
		Integer numero5 = 2;
		numero5 /= 2;
		System.out.println("numero5 /= 2: " + numero5);

		// Operador de module (resto)
		Double numero6 = 7.0;
		numero6 %= 4;
		System.out.println("numero6 %= 4: " + numero6);
		
		
	}
}
