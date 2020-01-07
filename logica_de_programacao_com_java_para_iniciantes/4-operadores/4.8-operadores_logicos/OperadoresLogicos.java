
public class OperadoresLogicos {

	public static void main(String[] args) {
		System.out.println("Operadores Lógicos");
		System.out.println("------------------");
		System.out.println("");
		System.out.println("[Operador]    [Tipo]           [Descrição]");
		System.out.println("&&            LÓGICO           Os dois lados do operador devem ser verdadeiros");
		System.out.println("||            LÓGICO           Um dos lados deve ser verdadeiro");
		System.out.println("!             LÓGICO           Reverte o valor");
		
		System.out.println("");
		
		System.out.println("Tabela \"AND\" [&&]");
		System.out.println("-----------");
		System.out.println("[item1]	[item2]	[Resultado]");
		System.out.println("true	true	true");
		System.out.println("true	false	false");
		System.out.println("false	true	false");
		System.out.println("false	false	false");
		
		System.out.println("");
		System.out.println("#################");
		System.out.println("");
		
		System.out.println("Exemplos:");
		System.out.println("---------");
		
		Boolean periodoDePromocaov1 = true;
		Boolean carrinhoMaiorQue100v1 = true;
		
		Boolean aplicarDescontoV1 = periodoDePromocaov1 && carrinhoMaiorQue100v1;
		
		if (aplicarDescontoV1) {
			System.out.println("Sim - Aplicar desconto.");
		} else {
			System.out.println("Não - Aplicar desconto.");
		}
		
		System.out.println("");
		System.out.println("#################");
		System.out.println("");
		
		System.out.println("Tabela \"OR\" [||]");
		System.out.println("-----------");
		System.out.println("[item1]	[item2]	[Resultado]");
		System.out.println("true	true	true");
		System.out.println("true	false	true");
		System.out.println("false	true	true");
		System.out.println("false	false	false");	
			
		System.out.println("");
		System.out.println("Exemplos:");
		System.out.println("---------");
		
		Boolean periodoDePromocaov2 = true;
		Boolean carrinhoMaiorQue100v2 = false;
		
		Boolean aplicarDescontoV2 = periodoDePromocaov2 || carrinhoMaiorQue100v2;
		
		if (aplicarDescontoV2) {
			System.out.println("Sim - Aplicar desconto.");
		} else {
			System.out.println("Não - Aplicar desconto.");
		}
		
		System.out.println("");
		System.out.println("#################");
		System.out.println("");
		
		System.out.println("Exemplos: [&&] e [||]");
		System.out.println("---------");
		
		Boolean periodoDePromocaov3 = true;
		Boolean carrinhoMaiorQue100v3 = false;
		Boolean clienteVip = false;
				
		Boolean aplicarDescontoV3 = periodoDePromocaov3 && (carrinhoMaiorQue100v3 || clienteVip);
		
		if (aplicarDescontoV3) {
			System.out.println("Sim - aplicar desconto.");
		} else {
			System.out.println("Não - aplicar desconto.");
			
		}
		
	}
}
