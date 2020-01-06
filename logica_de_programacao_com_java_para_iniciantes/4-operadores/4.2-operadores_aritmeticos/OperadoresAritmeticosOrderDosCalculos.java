
public class OperadoresAritmeticosOrderDosCalculos {

	public static void main(String[] args) {
		
		// O java respeita a ordem dos calculo seguindo o modelo matemático padrão.
		Integer calculo1 = 2 + (2 + 2) * 2;
		System.out.println("Calculo1: " + calculo1);
		
		Integer calculo2 = (2 + (2 + 2)) / 2;
		System.out.println("calculo2: " + calculo2);
		

	}
}
