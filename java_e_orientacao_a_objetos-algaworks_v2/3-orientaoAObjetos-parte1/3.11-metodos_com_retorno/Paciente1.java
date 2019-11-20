
public class Paciente1 {

	double peso;
	double altura;
		
	double calcularImc() {
		double  imc = peso / (altura * altura);
		return imc;
	}
}
