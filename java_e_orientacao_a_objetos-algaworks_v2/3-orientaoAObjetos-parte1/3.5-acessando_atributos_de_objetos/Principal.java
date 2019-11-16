
public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		Carro seuCarro = new Carro();

		meuCarro.anoDeFabricacao = 2016;
		meuCarro.cor = "Preto";
		meuCarro.fabricante = "Peugeot";
		meuCarro.modelo = "208";
		
		seuCarro.anoDeFabricacao = 2019;
		seuCarro.cor = "Branco";
		seuCarro.fabricante = "Toyota";
		seuCarro.modelo = "Corolla";
		
		System.out.println("Meu Carro");
		System.out.println("---------------");
		System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		
		System.out.println();
		
		System.out.println("Seu Carro");
		System.out.println("---------------");
		System.out.println("Ano de Fabricacao: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		
		
		
	}
}