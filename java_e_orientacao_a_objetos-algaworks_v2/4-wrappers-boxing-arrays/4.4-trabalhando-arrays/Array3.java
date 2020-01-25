
public class Array3 {

	public static void main(String[] args) {
		
		CarrosArray3[] carros = new CarrosArray3[2];
		
		carros[0] = new CarrosArray3();
		carros[0].anoFabricacao = 2014;
		carros[0].fabricante = "Chevrolet";
		carros[0].modelo = "Onix";
		
		carros[1] = new CarrosArray3();
		carros[1].anoFabricacao = 2016;
		carros[1].fabricante = "Peugeot";
		carros[1].modelo = "208";
		
		System.out.println("Total de carros: " + carros.length);
		
		for (int i = 0 ; i < carros.length ; i++) {
			
			System.out.println("Carro[" + i + "]: " + carros[i].modelo);
			
		}
		
		
		
	
	}
	
}
