
public class Principal1 {

	public static void main(String[] args) {
		Paciente1 p = new Paciente1();
		p.peso = 66;
		p.altura = 1.65;
		
		double imcCalculado = p.calcularImc();
		
		System.out.println("IMC do paciente: " + imcCalculado);
	}
}
