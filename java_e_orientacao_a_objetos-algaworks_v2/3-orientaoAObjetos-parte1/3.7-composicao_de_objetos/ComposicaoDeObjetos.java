
public class ComposicaoDeObjetos {

	public static void main(String[] args) {
		
		Proprietario dono = new Proprietario();
		
		dono.nome = "Eduardo";
		dono.cpf = "000.000.000-00";
		
		
		Moto moto = new Moto();
		moto.fabricante = "Suzuki";
		moto.modelo = "xxxyyy";
	
		moto.donoMoto = dono;
		
		System.out.println("O \"" + moto.donoMoto.nome + "\"" + "comprou a moto:" + moto.modelo);

	}

}
