package encapsulamento;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Exercicio03Pedido pedido = new Exercicio03Pedido();

		pedido.setCodigo(10);
		pedido.setDesconto(20);
		pedido.setSubtotal(1000.0);
		//pedido.setTotal(90.0);

		System.out.println("Código do Pedido: " + pedido.getCodigo());
		System.out.println("Desconto aplicado: " + pedido.getDesconto() + "%");
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Total: " + pedido.getTotal());
	}
}
