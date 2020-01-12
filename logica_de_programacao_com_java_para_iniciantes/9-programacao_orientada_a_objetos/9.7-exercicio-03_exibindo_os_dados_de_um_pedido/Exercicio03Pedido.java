package encapsulamento;

public class Exercicio03Pedido {
	
	Integer codigo;
	Double subtotal;
	Integer desconto;
	// Double total;
	
	Integer getCodigo() {
		return codigo;
	}
	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	Double getSubtotal() {
		return subtotal;
	}
	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	Integer getDesconto() {
		return desconto;
	}
	void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}
	Double getTotal() {
		// subtotal(100) - 100%
		// desconto(x)   - 10%
		// 100%desconto(x) = 10% * subtotal(100)
		// desconto(x) = (10% * subtotal(100)) / 100
		
 		Double total = this.subtotal - (this.desconto * this.subtotal) / 100;
 		return total;
	}
	
	void setTotal(Double total) {
		//this.total = total;
	}
	
}
