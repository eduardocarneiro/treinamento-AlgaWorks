
public class AcessandoAtributoDeUmObjeto {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		moto.fabricante = "Honda";
		moto.modelo = "CG";
		moto.anoDeFabricacao = 2016;
		
		System.out.println("Dados da moto - [fabricante]: " + moto.fabricante);

	}

}
