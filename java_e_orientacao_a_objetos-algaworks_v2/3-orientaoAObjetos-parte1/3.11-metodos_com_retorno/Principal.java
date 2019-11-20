
public class Principal {

	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		p.peso = 150;
		p.altura = 1.65;
		
		IMC imc = p.calularIndiceIMC();
		
		System.out.println("Abaixo do peso: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso Ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
	}
}
