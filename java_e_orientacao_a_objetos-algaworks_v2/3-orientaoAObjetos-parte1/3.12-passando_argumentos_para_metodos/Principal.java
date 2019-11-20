
public class Principal {

	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		
		double salario = folha.calularSalario(168, 15, 96.5, 35.5);
		
		System.out.println("Salário calculado: " + salario);
				
	}
}
