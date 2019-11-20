
public class FolhaDePagamento {

	// Assinatura do método;
	// quando vc tem um método que passa-se argumentos, vc pode dizer que a assinatura do método é:
	// double calcularSalario(int, int, double, double)
	// }

	double calularSalario (int horasNormal, int horasExtra, double valorHoraNormal, double valorHoraExtra) {
		
		double valorHorasNormais = horasNormal * valorHoraNormal;
		double valorHorasExtras = horasExtra * valorHoraExtra;
			
		return valorHorasNormais + valorHorasExtras;
		
		}
	
	}